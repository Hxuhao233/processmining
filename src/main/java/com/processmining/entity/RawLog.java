package com.processmining.entity;



public class RawLog extends Log{
    public RawLog(){
    	super();
    }
    
    private int toNormLogId;
    
    private String toNormLogName;
    
    private int toEventLogId;
    
    private String toEventLogName;

	public int getToNormLogId() {
		return toNormLogId;
	}

	public void setToNormLogId(int toNormLogId) {
		this.toNormLogId = toNormLogId;
	}

	public String getToNormLogName() {
		return toNormLogName;
	}

	public void setToNormLogName(String toNormLogName) {
		this.toNormLogName = toNormLogName;
	}

	public int getToEventLogId() {
		return toEventLogId;
	}

	public void setToEventLogId(int toEventLogId) {
		this.toEventLogId = toEventLogId;
	}

	public String getToEventLogName() {
		return toEventLogName;
	}

	public void setToEventLogName(String toEventLogName) {
		this.toEventLogName = toEventLogName;
	}
    
    
    
}