package com.processmining.entity;

import java.util.Date;

public class StandardizedLog {
    private Integer id;

    private String name;

    private String hdfsid;

    private Date createtime;

    private Integer creatorid;

    private Integer originallogid;

    private Integer eventlog;

    private String format;

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
        this.name = name == null ? null : name.trim();
    }

    public String getHdfsid() {
        return hdfsid;
    }

    public void setHdfsid(String hdfsid) {
        this.hdfsid = hdfsid == null ? null : hdfsid.trim();
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

    public Integer getOriginallogid() {
        return originallogid;
    }

    public void setOriginallogid(Integer originallogid) {
        this.originallogid = originallogid;
    }

    public Integer getEventlog() {
        return eventlog;
    }

    public void setEventlog(Integer eventlog) {
        this.eventlog = eventlog;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }
}