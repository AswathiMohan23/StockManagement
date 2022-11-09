package com.java;

import java.util.Scanner;

public class Account implements IStockAccount {
    StockDetails stockDetails=new StockDetails();
    StockManagementMethods stockManagementMethods=new StockManagementMethods();

    Scanner sc=new Scanner(System.in);
    @Override
    public double valueOfAccountAfterDebitOrCredit(long balance, String company,String operation) {
        // here operation is debit or credit
        long dollars=balance*81; // 1 dollar =81 INR
        System.out.println("\n===================Value of "+company+" account in dollars after "+operation+" ===============\n"+dollars);
        return 0;
    }


    @Override
    public void buyOrSellShares() {
        System.out.println("\nchoose an option \n1 ===> buyShare\n2 ===> SellShares");
        int option =sc.nextInt();
        switch (option){
            case 1: buyShares();
                break;
            case 2: sellShares();
                break;
            default:
                break;
        }

    }
    @Override
    public void buyShares() {
        System.out.println("********************************* Buy share *****************************");
        String choice ="buy";
        System.out.println("Enter the choice :  1 ===> tcs\n2 ===> Wipro\n3 ===> Bosch");
        int option = sc.nextInt();
        stockManagementMethods.sellingAndBuyingDetails(option,choice);

    }

    @Override
    public void sellShares() {
        System.out.println("******************************* Sell share ***************************");
        String choice ="sell";
        System.out.println("select the correct choice for selling  :  1 ===> tcs\n2 ===> Wipro\n3 ===> Bosch");
        int option = sc.nextInt();
        stockManagementMethods.sellingAndBuyingDetails(option,choice);

    }
}
