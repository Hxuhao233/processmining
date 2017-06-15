package com.processmining.entity;

import java.util.Date;

public class OriginalLog {
    private Integer id;

    private Integer creatorid;

    private Date createtime;

    private String name;

    private String hdfsid;

    private Integer standardizedlogid;

    private String format;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public Integer getStandardizedlogid() {
        return standardizedlogid;
    }

    public void setStandardizedlogid(Integer standardizedlogid) {
        this.standardizedlogid = standardizedlogid;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }
}