package com.java;

public class StockAccountClass implements IStockAccount {


    @Override
    public double valueOfAccountAfterDebitOrCredit(long balance, String company,String operation) {
        // here operation is debit or credit
        long dollars=balance*81; // 1 dollar =81 INR
        System.out.println("\n===================Value of "+company+" account in dollars after "+operation+" ===============\n"+dollars);
        return 0;
    }


}
