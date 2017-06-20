package com.processmining.support.eventlog;

import java.io.File;
import org.deckfour.xes.model.XLog;

/**
 * 事件日志的持久化
 * @author 琪
 *
 */
public interface EventLogExport {
	
	public void convertXLogToXesFile(XLog xlog, File file);

}
