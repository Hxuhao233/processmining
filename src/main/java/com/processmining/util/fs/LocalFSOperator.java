package com.processmining.util.fs;

import java.io.IOException;
import java.io.InputStream;

/**
 * 本地文件系统操作
 * @author hxh12
 *
 */
public class LocalFSOperator extends FSOperator{

	@Override
	public InputStream downloadFile(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean createDirectory(String name) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exists(String name) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFile(String name) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String uploadFile(InputStream input, String hdfsPath) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
