package com.processmining.util.fs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.UUID;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Repository
public class HDFSOperator extends FSOperator{
	
	//@Autowired
	private FileSystem fs;

    public FileSystem getFs() {
		return fs;
	}

	public void setFs(FileSystem fs) {
		this.fs = fs;
	}

	/** 
     * 将本地文件(filePath)上传到HDFS服务器的指定路径(dst) 
     * @param filePath 
     * @param dst 
     * @throws Exception 
     */  
    public void uploadFileToHDFS(String filePath,String dst) throws Exception {  
        Path srcPath = new Path(filePath);  
        Path dstPath = new Path(dst);  
        long start = System.currentTimeMillis();  
        fs.copyFromLocalFile( srcPath, dstPath);  
        
        System.out.println("Time:"+ (System.currentTimeMillis() - start));  
          
        System.out.println("________________________Upload to " + dst + "________________________");  
        //fs.close(); 
        
        getDirectoryFromHdfs(dst);  
    }  
    
    
    public String uploadFile(InputStream input,String hdfsPath) throws Exception{
		
    	String path = hdfsPath + UUID.randomUUID();
		Path hdfsPath1 = new Path(path);
		
	
		FSDataOutputStream out = fs.create(hdfsPath1);
		IOUtils.copyBytes(input, out,fs.getConf());

		return path;
    }
    
    
    
    /** 
     * 遍历指定目录(direPath)下的所有文件 
     * @param direPath 
     * @throws Exception 
     */  
    public String getDirectoryFromHdfs(String direPath) throws Exception{  
          
    	StringBuilder ret = new StringBuilder();
        FileStatus[] filelist = fs.listStatus(new Path(direPath));  
        for (int i = 0; i < filelist.length; i++) {  
            System.out.println("_________________***********************____________________");  
            ret.append("_________________***********************____________________\n");
            FileStatus fileStatus = filelist[i];  
            System.out.println("Name:"+fileStatus.getPath().getName());  
            ret.append("Name:"+fileStatus.getPath().getName()+"\n");
            System.out.println("size:"+fileStatus.getLen());  
            ret.append("size:"+fileStatus.getLen()+"\n");
            System.out.println("_________________***********************____________________");  
            ret.append("_________________***********************____________________\n");
        }  
        //fs.close();  
        return ret.toString();
    }  
    
    /** 
     * 判断路径是否存在 
     *  
     * @param conf 
     * @param path 
     * @return 
     * @throws IOException 
     */  
    public boolean exists(String path) throws IOException {   
        return fs.exists(new Path(path));  
    }  
    
    
    /** 
     * 创建目录 
     *  
     * @param conf 
     * @param dirName 
     * @return 
     * @throws IOException 
     */  
    public boolean createDirectory(String dirName) throws IOException { 
        Path dir = new Path(dirName);  
        boolean result = false;  
        if (!fs.exists(dir)) {  
            result = fs.mkdirs(dir);  
        }  
        return result;  
    }  
    
   
    /** 
     * 下载 hdfs上的文件 
     *  
     * @param conf 
     * @param uri 
     * @param remote 
     * @param local 
     * @throws IOException 
     */  
    /*
    public void download(String remote, String local) throws IOException {  
        Path path = new Path(remote);    
        fs.copyToLocalFile(false,path, new Path(local));  
        System.out.println("download: from" + remote + " to " + local);  
        //fs.close();  
    }  
    */
    
    
    public InputStream downloadFile(String path) throws Exception{
    	InputStream input = fs.open(new Path(path));
    	return input;
    }
    
    
    
    /** 
     * 删除目录或文件 
     *  
     * @param conf 
     * @param remoteFilePath 
     * @param recursive 
     * @return 
     * @throws IOException 
     */  
    public boolean deleteFile(String remoteFilePath, boolean recursive)  
            throws IOException {  
        boolean result = fs.delete(new Path(remoteFilePath), recursive);  
        //fs.close();  
        return result;  
    }  
  
    /** 
     * 删除目录或文件(如果有子目录,则级联删除) 
     *  
     * @param conf 
     * @param remoteFilePath 
     * @return 
     * @throws IOException 
     */  
    public boolean deleteFile(String remoteFilePath) throws IOException {  
        return deleteFile(remoteFilePath, true);  
    }






    

}
