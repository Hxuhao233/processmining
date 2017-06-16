package com.processmining.entity;

public class MiningAlgoParam {
    private Integer id;

    private Integer miningalgoid;

    private String paramname;

    private String format;

    private String defaultvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMiningalgoid() {
        return miningalgoid;
    }

    public void setMiningalgoid(Integer miningalgoid) {
        this.miningalgoid = miningalgoid;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname == null ? null : paramname.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue == null ? null : defaultvalue.trim();
    }
}