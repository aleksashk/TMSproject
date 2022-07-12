package com.gmail.aleksandrphilimonov.lesson7.classwork.task3.model.entity;

import java.util.Date;

public class FinancialInvoice extends Contract {
    private String departmentCode;
    private double totalAmount;

    public FinancialInvoice(String numberOfDoc, Date dateOfDoc) {
        super(numberOfDoc, dateOfDoc);
    }

    public FinancialInvoice(String numberOfDoc, Date dateOfDoc, String departmentCode, double totalAmount) {
        super(numberOfDoc, dateOfDoc);
        this.departmentCode = departmentCode;
        this.totalAmount = totalAmount;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
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
                "departmentCode = " +
                departmentCode +
                '\n' +
                "totalAmount = " +
                totalAmount;
    }
}
