package com.gmail.aleksandrphilimonov.lesson7.classwork.task3.entity;

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
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------------------\n")
                .append(getClass().getSimpleName())
                .append(":\n")
                .append("numberOfDoc = ")
                .append(super.getNumberOfDoc())
                .append("\n")
                .append("dateOfDoc = ")
                .append(super.getDateOfDoc())
                .append("\n")
                .append("contractStartDate = ")
                .append(contractStartDate)
                .append('\n')
                .append("contractEndDate = ")
                .append(contractEndDate);
        return sb.toString();
    }
}
