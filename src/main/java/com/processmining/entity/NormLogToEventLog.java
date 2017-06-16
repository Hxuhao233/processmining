package com.processmining.entity;

public class NormLogToEventLog {
    private Integer id;

    private Integer normalizedlogid;

    private Integer eventlogid;

    private String normalizedlogname;

    private String eventlogname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNormalizedlogid() {
        return normalizedlogid;
    }

    public void setNormalizedlogid(Integer normalizedlogid) {
        this.normalizedlogid = normalizedlogid;
    }

    public Integer getEventlogid() {
        return eventlogid;
    }

    public void setEventlogid(Integer eventlogid) {
        this.eventlogid = eventlogid;
    }

    public String getNormalizedlogname() {
        return normalizedlogname;
    }

    public void setNormalizedlogname(String normalizedlogname) {
        this.normalizedlogname = normalizedlogname == null ? null : normalizedlogname.trim();
    }

    public String getEventlogname() {
        return eventlogname;
    }

    public void setEventlogname(String eventlogname) {
        this.eventlogname = eventlogname == null ? null : eventlogname.trim();
    }
}