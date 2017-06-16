package com.processmining.entity;

public class MergeEventLog {
    private Integer id;

    private Integer targeteventlogid;

    private Integer sourceeventlog1id;

    private Integer sourceeventlog2id;

    private String targetname;

    private String source1name;

    private String source2name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTargeteventlogid() {
        return targeteventlogid;
    }

    public void setTargeteventlogid(Integer targeteventlogid) {
        this.targeteventlogid = targeteventlogid;
    }

    public Integer getSourceeventlog1id() {
        return sourceeventlog1id;
    }

    public void setSourceeventlog1id(Integer sourceeventlog1id) {
        this.sourceeventlog1id = sourceeventlog1id;
    }

    public Integer getSourceeventlog2id() {
        return sourceeventlog2id;
    }

    public void setSourceeventlog2id(Integer sourceeventlog2id) {
        this.sourceeventlog2id = sourceeventlog2id;
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname == null ? null : targetname.trim();
    }

    public String getSource1name() {
        return source1name;
    }

    public void setSource1name(String source1name) {
        this.source1name = source1name == null ? null : source1name.trim();
    }

    public String getSource2name() {
        return source2name;
    }

    public void setSource2name(String source2name) {
        this.source2name = source2name == null ? null : source2name.trim();
    }
}