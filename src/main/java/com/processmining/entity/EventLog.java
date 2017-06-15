package com.processmining.entity;

import java.util.Date;

public class EventLog {
    private Integer id;

    private String name;

    private String hdfsid;

    private Date createtime;

    private Integer creatorid;

    private Integer standardizedlogid;

    private String format;

    private Integer source1id;

    private Integer source2id;

    private String controller;

    private Integer totalinstancenum;

    private Integer totaleventnum;

    private Integer average;

    private String processactivityevent;

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

    public Integer getSource1id() {
        return source1id;
    }

    public void setSource1id(Integer source1id) {
        this.source1id = source1id;
    }

    public Integer getSource2id() {
        return source2id;
    }

    public void setSource2id(Integer source2id) {
        this.source2id = source2id;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller == null ? null : controller.trim();
    }

    public Integer getTotalinstancenum() {
        return totalinstancenum;
    }

    public void setTotalinstancenum(Integer totalinstancenum) {
        this.totalinstancenum = totalinstancenum;
    }

    public Integer getTotaleventnum() {
        return totaleventnum;
    }

    public void setTotaleventnum(Integer totaleventnum) {
        this.totaleventnum = totaleventnum;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    public String getProcessactivityevent() {
        return processactivityevent;
    }

    public void setProcessactivityevent(String processactivityevent) {
        this.processactivityevent = processactivityevent == null ? null : processactivityevent.trim();
    }
}