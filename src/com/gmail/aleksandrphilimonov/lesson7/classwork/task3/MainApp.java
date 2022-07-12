package com.gmail.aleksandrphilimonov.lesson7.classwork.task3;

import com.gmail.aleksandrphilimonov.lesson7.classwork.task3.model.entity.ContractForSupplyGoods;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task3.model.entity.ContractWithEmployee;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task3.model.entity.FinancialInvoice;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task3.model.entity.Register;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainApp {
    public static void main(String[] args) {
        ContractForSupplyGoods goodsDoc = new ContractForSupplyGoods("a32-07", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "food", 125);
        ContractWithEmployee contractWithEmployee = new ContractWithEmployee("contract08-98", new GregorianCalendar(2020, Calendar.JULY, 4).getTime(), new GregorianCalendar(2020, Calendar.JULY, 4).getTime(), new GregorianCalendar(2021, Calendar.FEBRUARY, 12).getTime(), "Marckov Ivan Demidovich");
        FinancialInvoice financialInvoice = new FinancialInvoice("RTY-05.235", new GregorianCalendar(2021, Calendar.APRIL, 30).getTime(), "DEP-089744", 25_000_000.56);

        ContractForSupplyGoods goodsDoc1 = new ContractForSupplyGoods("a311-07", new GregorianCalendar(2015, Calendar.FEBRUARY, 2).getTime(), "shoes", 3);
        ContractWithEmployee contractWithEmployee1 = new ContractWithEmployee("contract08-x28", new GregorianCalendar(2015, Calendar.MAY, 25).getTime(), new GregorianCalendar(2015, Calendar.MAY, 25).getTime(), new GregorianCalendar(2020, Calendar.NOVEMBER, 3).getTime(), "Svetlov Dmitry Nicolaevich");
        FinancialInvoice financialInvoice1 = new FinancialInvoice("RTY-03.78", new GregorianCalendar(2020, Calendar.DECEMBER, 3).getTime(), "DEP-00001", 1250.56);
        ContractForSupplyGoods goodsDoc2 = new ContractForSupplyGoods("cfd-45", new GregorianCalendar(2000, Calendar.MARCH, 4).getTime(), "car", 500);
        ContractWithEmployee contractWithEmployee2 = new ContractWithEmployee("contract10-25", new GregorianCalendar(2001, Calendar.OCTOBER, 17).getTime(), new GregorianCalendar(2001, Calendar.OCTOBER, 17).getTime(), new GregorianCalendar(2022, Calendar.JANUARY, 6).getTime(), "Vlasova Reginf Francevna");
        FinancialInvoice financialInvoice2 = new FinancialInvoice("HGR-01.005", new GregorianCalendar(1999, Calendar.NOVEMBER, 15).getTime(), "FEW-000744", 125.56);
        FinancialInvoice financialInvoice3 = new FinancialInvoice("RTW-05.065", new GregorianCalendar(2015, Calendar.FEBRUARY, 22).getTime(), "LOPIO-06", 87.04);

        Register register = new Register();
        register.saveDoc(goodsDoc);
        register.saveDoc(goodsDoc1);
        register.saveDoc(goodsDoc2);
        register.saveDoc(contractWithEmployee);
        register.saveDoc(contractWithEmployee1);
        register.saveDoc(contractWithEmployee2);
        register.saveDoc(financialInvoice);
        register.saveDoc(financialInvoice1);
        register.saveDoc(financialInvoice2);
        register.saveDoc(financialInvoice3);

        for (int i = 0; i < register.getStorage().length; i++) {
            System.out.println(register.getStorage()[i].getInfo());
        }
    }
}
