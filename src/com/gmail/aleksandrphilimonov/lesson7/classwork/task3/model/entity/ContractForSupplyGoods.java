package com.gmail.aleksandrphilimonov.lesson7.classwork.task3.model.entity;

import java.util.Date;

public class ContractForSupplyGoods extends Contract {
    private String goodType;
    private int countOfGood;

    public ContractForSupplyGoods(String numberOfDoc, Date dateOfDoc) {
        super(numberOfDoc, dateOfDoc);
    }

    public ContractForSupplyGoods(String numberOfDoc, Date dateOfDoc, String goodType, int countOfGood) {
        super(numberOfDoc, dateOfDoc);
        this.goodType = goodType;
        this.countOfGood = countOfGood;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public int getCountOfGood() {
        return countOfGood;
    }

    public void setCountOfGood(int countOfGood) {
        this.countOfGood = countOfGood;
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
                "goodType = " +
                goodType +
                '\n' +
                "countOfGood = " +
                countOfGood;
    }
}
