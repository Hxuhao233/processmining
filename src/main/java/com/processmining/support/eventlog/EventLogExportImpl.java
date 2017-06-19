package com.processmining.support.eventlog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import org.deckfour.xes.model.XLog;
import org.deckfour.xes.out.XesXmlSerializer;

public class EventLogExportImpl implements EventLogExport {

	@Override
	public void convertXLogToXesFile(XLog xlog, File file) {
		//创建文件输出流
		OutputStream out = null;
		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("lq.......................");
			e.printStackTrace();			
		}
		//创建XesXmlSerializer
		XesXmlSerializer xesXmlSerializer = new XesXmlSerializer();
		//利用XesXmlSerializer的serialize方法进行序列化，写出文件到out
		try {
			xesXmlSerializer.serialize(xlog, out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
