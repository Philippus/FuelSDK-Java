//
// ETSoapObject.java -
//
//      x
//
// Copyright (C) 2013 ExactTarget
//
// @COPYRIGHT@
//

package com.exacttarget.fuelsdk.model;

import com.exacttarget.fuelsdk.annotations.InternalSoapField;

import java.util.Date;

public abstract class ETSoapObject {
    @InternalSoapField(name="id")
    protected Integer id;
    @InternalSoapField(name="customerKey")
    protected String customerKey;
    @InternalSoapField(name="createdDate")
    protected Date createdDate;
    @InternalSoapField(name="modifiedDate")
    protected Date modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerKey() {
        return customerKey;
    }

    public void setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}