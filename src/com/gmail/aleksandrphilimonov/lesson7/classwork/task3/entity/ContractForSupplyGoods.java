package com.gmail.aleksandrphilimonov.lesson7.classwork.task3.entity;

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
                .append("goodType = ")
                .append(goodType)
                .append('\n')
                .append("countOfGood = ")
                .append(countOfGood);
        return sb.toString();
    }
}
