package com.processmining.entity;

import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"creatorid","createtime"})
public abstract class Log {
	protected Integer id;

    protected String name;

    protected String format;

    protected Date createtime;
    
    @Transient
    protected String createTime;
    
    protected Integer creatorid;
    
    @Transient
    protected String creator;
    
    protected String hdfsid;

    protected Boolean isshared;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getCreatorid() {
		return creatorid;
	}

	public void setCreatorid(Integer creatorid) {
		this.creatorid = creatorid;
	}

	public String getHdfsid() {
		return hdfsid;
	}

	public void setHdfsid(String hdfsid) {
		this.hdfsid = hdfsid;
	}

	public Boolean getIsshared() {
		return isshared;
	}

	public void setIsshared(Boolean isshared) {
		this.isshared = isshared;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(DateFormat format) {
		this.createTime = format.format(this.createtime);
	}
    
    
    
}
