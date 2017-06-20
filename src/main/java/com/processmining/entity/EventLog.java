package com.processmining.entity;

import java.util.Date;

public class EventLog {
    private Integer id;

    private String name;

    private String format;

    private Date createtime;

    private Boolean ismerged;

    private String controller;

    private Integer totalinstancenum;

    private Integer totaleventnum;

    private Integer average;

    private String processactivityevent;

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

    public Boolean getIsmerged() {
        return ismerged;
    }

    public void setIsmerged(Boolean ismerged) {
        this.ismerged = ismerged;
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

    public Boolean getIsshared() {
        return isshared;
    }

    public void setIsshared(Boolean isshared) {
        this.isshared = isshared;
    }
}