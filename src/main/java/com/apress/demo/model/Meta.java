package com.apress.demo.model;

import java.util.Date;

public class Meta {
    private Double data_version;
    private Date created;
    private Integer revision;

    public Double getData_version() {
        return data_version;
    }

    public void setData_version(Double data_version) {
        this.data_version = data_version;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }
}
