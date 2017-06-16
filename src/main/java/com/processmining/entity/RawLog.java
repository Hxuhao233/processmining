package com.processmining.entity;

import java.util.Date;

public class RawLog {
    private Integer id;

    private String name;

    private String format;

    private Date createtime;

    private Integer creatorid;

    private String hdfsid;

    private Boolean isshared;

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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
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
        this.hdfsid = hdfsid == null ? null : hdfsid.trim();
    }

    public Boolean getIsshared() {
        return isshared;
    }

    public void setIsshared(Boolean isshared) {
        this.isshared = isshared;
    }
}