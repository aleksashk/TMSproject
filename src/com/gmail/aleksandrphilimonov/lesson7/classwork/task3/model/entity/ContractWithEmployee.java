package com.gmail.aleksandrphilimonov.lesson7.classwork.task3.model.entity;

import java.util.Date;

public class ContractWithEmployee extends Contract {
    private Date contractStartDate;
    private Date contractEndDate;
    private String employeeName;

    public ContractWithEmployee(String numberOfDoc, Date dateOfDoc) {
        super(numberOfDoc, dateOfDoc);
    }

    public ContractWithEmployee(String numberOfDoc, Date dateOfDoc, Date contractStartDate, Date contractEndDate, String employeeName) {
        super(numberOfDoc, dateOfDoc);
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String getInfo() {
        return "---------------------------------------------------\n" +
                getClass().getSimpleName() +
                ":\n" +
                "numberOfDoc = " +
                super.getNumberOfDoc() +
                "\n" +
                "dateOfDoc = " +
                super.getDateOfDoc() +
                "\n" +
                "contractStartDate = " +
                contractStartDate +
                '\n' +
                "contractEndDate = " +
                contractEndDate;
    }
}
