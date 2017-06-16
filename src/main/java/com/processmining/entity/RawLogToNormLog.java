package com.processmining.entity;

public class RawLogToNormLog {
    private Integer id;

    private Integer rawlogid;

    private Integer normalizedlogid;

    private String rawlogname;

    private String normalizedlogname;

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

    public Integer getNormalizedlogid() {
        return normalizedlogid;
    }

    public void setNormalizedlogid(Integer normalizedlogid) {
        this.normalizedlogid = normalizedlogid;
    }

    public String getRawlogname() {
        return rawlogname;
    }

    public void setRawlogname(String rawlogname) {
        this.rawlogname = rawlogname == null ? null : rawlogname.trim();
    }

    public String getNormalizedlogname() {
        return normalizedlogname;
    }

    public void setNormalizedlogname(String normalizedlogname) {
        this.normalizedlogname = normalizedlogname == null ? null : normalizedlogname.trim();
    }
}