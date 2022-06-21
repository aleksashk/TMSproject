package com.gmail.aleksandrphilimonov.lesson7.classwork.task3.entity;

import java.util.Date;

public abstract class Contract implements Showable {
    private String numberOfDoc;
    private Date dateOfDoc;

    public Contract(String numberOfDoc, Date dateOfDoc) {
        this.numberOfDoc = numberOfDoc;
        this.dateOfDoc = dateOfDoc;
    }

    public String getNumberOfDoc() {
        return numberOfDoc;
    }

    public void setNumberOfDoc(String numberOfDoc) {
        this.numberOfDoc = numberOfDoc;
    }

    public Date getDateOfDoc() {
        return dateOfDoc;
    }

    public void setDateOfDoc(Date dateOfDoc) {
        this.dateOfDoc = dateOfDoc;
    }

    public abstract String getInfo();
}
