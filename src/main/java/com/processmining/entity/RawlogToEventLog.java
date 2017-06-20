package com.processmining.entity;

public class RawlogToEventLog {
    private Integer id;

    private Integer rawlogid;

    private Integer eventlogid;

    private String rawlogname;

    private String eventlogname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRawlogid() {
        return rawlogid;
    }

    public void setRawlogid(Integer rawlogid) {
        this.rawlogid = rawlogid;
    }

    public Integer getEventlogid() {
        return eventlogid;
    }

    public void setEventlogid(Integer eventlogid) {
        this.eventlogid = eventlogid;
    }

    public String getRawlogname() {
        return rawlogname;
    }

    public void setRawlogname(String rawlogname) {
        this.rawlogname = rawlogname == null ? null : rawlogname.trim();
    }

    public String getEventlogname() {
        return eventlogname;
    }

    public void setEventlogname(String eventlogname) {
        this.eventlogname = eventlogname == null ? null : eventlogname.trim();
    }
}