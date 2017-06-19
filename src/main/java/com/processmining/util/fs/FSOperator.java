package com.processmining.util.fs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public abstract class FSOperator {
	public abstract InputStream downloadFile(String name)throws Exception;
	public abstract String uploadFile(InputStream input,String hdfsPath)throws Exception;
	public abstract boolean createDirectory(String name)throws IOException;
	public abstract boolean exists(String name)throws IOException;
	public abstract boolean deleteFile(String name)throws IOException;
}
