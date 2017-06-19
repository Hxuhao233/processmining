package com.processmining.support.eventlog;

import java.io.InputStream;

import org.deckfour.xes.model.XLog;

/**
 * 事件日志流解析出XLog对象
 */
public interface EventLogParse {
	
	public XLog eventLogParse(InputStream in);
	
}
