package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
    static StockAccountClass stockAccountClass =new StockAccountClass();

    static ArrayList tcsList=new ArrayList();
    static ArrayList wiproList=new ArrayList();
    static ArrayList boschList=new ArrayList();
    static Scanner sc=new Scanner(System.in);


    static StockDetails stockDetails=new StockDetails();
    public static void main(String[] args){
        readInput("tcs",tcsList);
        totalValueOfShares("tcs");
        readInput("wipro",wiproList);
        totalValueOfShares("wipro");
        readInput("bosch",boschList);
        totalValueOfShares("bosch");
        System.out.println(tcsList+"\n"+boschList+"\n"+wiproList);
        creditAndDebit();
    }

    public static void totalValueOfShares(String company) {
        long totalShares= stockDetails.getShares()* stockDetails.getSharePrice();
        if(company.equals("tcs")) {
            stockDetails.setTotalValueOfSharesTcs(totalShares);
            System.out.println("================>>>>>> TotalValue of shares for " + company + " = " + stockDetails.getTotalValueOfSharesTcs());
        } else if (company.equals("wipro")) {
            stockDetails.setTotalValueOfSharesWipro(totalShares);
            System.out.println("================>>>>>> TotalValue of shares for " + company + " = " + stockDetails.getTotalValueOfSharesWipro());
        } else if (company.equals("bosch")) {
            stockDetails.setTotalValueOfSharesBosch(totalShares);
            System.out.println("================>>>>>> TotalValue of shares for " + company + " = " + stockDetails.getTotalValueOfSharesBosch());
        }
    }

    public static void readInput(String company, ArrayList list) {
        System.out.println("\nEnter the details of : "+company);
        System.out.println("stockName : "+company);
        stockDetails.setStockName(company);
        list.add(company);
        System.out.println("enter the shares : ");
        stockDetails.setShares(sc.nextInt());
        list.add(stockDetails.getShares());
        System.out.println("enter share price : ");
        stockDetails.setSharePrice(sc.nextInt());
        list.add(stockDetails.getSharePrice());


    }
    public static void creditAndDebit() {
        accountValuesOfCompanies();
        System.out.println("\nchoose the stock name and operation \n1 ===> tcs--credit\n2 ===> wipro--credit\n3 ===> bosch--credit\n" +
                "4 ===>tcs--debit\n5 ===> wipro--debit\n6 ===> bosch--debit");
        int option =sc.nextInt();
        switch (option){
            case 1: companyShareDetails("tcs","credit");
                break;
            case 2: companyShareDetails("wipro","credit");
                break;
            case 3: companyShareDetails("bosch","credit");
                break;
            case 4: companyShareDetails("tcs","debit");
                break;
            case 5: companyShareDetails("wipro","debit");
                break;
            case 6: companyShareDetails("bosch","debit");
                break;
            default:
                break;
        }

    }

    private static void accountValuesOfCompanies() {
        long dollarsTcs=stockDetails.getTotalValueOfSharesTcs()*81; // 1 dollar =81 INR
        System.out.println("\n==========================Account value of TCS in dollars ============================\n"+dollarsTcs);
        long dollarsWipro=stockDetails.getTotalValueOfSharesWipro()*81; // 1 dollar =81 INR
        System.out.println("\n==========================Account value of Wipro in dollars ============================\n"+dollarsWipro);
        long dollarsBosch=stockDetails.getTotalValueOfSharesBosch()*81; // 1 dollar =81 INR
        System.out.println("\n==========================Account value of Bosch in dollars ============================\n"+dollarsBosch);
    }

    private static void companyShareDetails(String companyName, String operation) {
        long totalAmount;
        if(companyName.equals("tcs")) {
            totalAmount = stockDetails.getTotalValueOfSharesTcs();
            findingBalance(totalAmount,operation,companyName);
        }else if(companyName.equals("wipro")) {
            totalAmount = stockDetails.getTotalValueOfSharesWipro();
            findingBalance(totalAmount,operation,companyName);
        }
        else if(companyName.equals("bosch")) {
            totalAmount = stockDetails.getTotalValueOfSharesBosch();
            findingBalance(totalAmount,operation,companyName);
        }
    }
    private static void findingBalance(long totalAmount, String operation,String company) {
        System.out.println("Total balance in the account is : " + totalAmount + "\nEnter the amount : ");
        if (operation.equals("debit")) {
            long requiredAmount = sc.nextLong();
            if (requiredAmount <= totalAmount) {
                long balance = totalAmount - requiredAmount;
                System.out.println("Transaction successful !!!! Available balance amount is : " + balance);
                stockAccountClass.valueOfAccountAfterDebitOrCredit(balance,company,"debit");
            } else System.out.println("Sorry there is no sufficient balance !!!!! try again.......");
        } else if (operation.equals("credit")) {
            long depositingAmount = sc.nextLong();
            long balance = totalAmount + depositingAmount;
            System.out.println("Amount successfully credited !!!! Available balance amount is : " + balance);
            stockAccountClass.valueOfAccountAfterDebitOrCredit(balance,company,"credit");
        }
    }






}

