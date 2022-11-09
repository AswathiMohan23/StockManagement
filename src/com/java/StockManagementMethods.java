package com.java;

import java.util.ArrayList;
import java.util.Scanner;

import static com.java.StockManagement.account;
import static com.java.StockManagement.stockDetails;

public class StockManagementMethods {
    static Scanner sc = new Scanner(System.in);

    public static void creditAndDebit() {
        accountValuesOfCompanies();
        System.out.println("\nchoose the stock name and operation \n1 ===> tcs--credit\n2 ===> wipro--credit\n3 ===> bosch--credit\n" +
                "4 ===>tcs--debit\n5 ===> wipro--debit\n6 ===> bosch--debit");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                companyShareDetails("tcs", "credit");
                break;
            case 2:
                companyShareDetails("wipro", "credit");
                break;
            case 3:
                companyShareDetails("bosch", "credit");
                break;
            case 4:
                companyShareDetails("tcs", "debit");
                break;
            case 5:
                companyShareDetails("wipro", "debit");
                break;
            case 6:
                companyShareDetails("bosch", "debit");
                break;
            default:
                break;
        }

    }

    private static void accountValuesOfCompanies() {
        long dollarsTcs = stockDetails.getTotalValueOfSharesTcs() * 81; // 1 dollar =81 INR
        System.out.println("\n==========================   Account value of TCS in dollars   ============================\n" + dollarsTcs);
        long dollarsWipro = stockDetails.getTotalValueOfSharesWipro() * 81; // 1 dollar =81 INR
        System.out.println("\n==========================  Account value of Wipro in dollars  ============================\n" + dollarsWipro);
        long dollarsBosch = stockDetails.getTotalValueOfSharesBosch() * 81; // 1 dollar =81 INR
        System.out.println("\n==========================  Account value of Bosch in dollars  ============================\n" + dollarsBosch);
    }

    private static void companyShareDetails(String companyName, String operation) {
        long totalAmount;
        if (companyName.equals("tcs")) {
            totalAmount = stockDetails.getTotalValueOfSharesTcs();
            findingBalance(totalAmount, operation, companyName);
        } else if (companyName.equals("wipro")) {
            totalAmount = stockDetails.getTotalValueOfSharesWipro();
            findingBalance(totalAmount, operation, companyName);
        } else if (companyName.equals("bosch")) {
            totalAmount = stockDetails.getTotalValueOfSharesBosch();
            findingBalance(totalAmount, operation, companyName);
        }
    }

    private static void findingBalance(long totalAmount, String operation, String company) {
        System.out.println("Total balance in the account is : " + totalAmount + "\nEnter the amount : ");
        if (operation.equals("debit")) {
            long requiredAmount = sc.nextLong();
            if (requiredAmount <= totalAmount) {
                long balance = totalAmount - requiredAmount;
                System.out.println("Transaction successful !!!! Available balance amount is : " + balance);
                account.valueOfAccountAfterDebitOrCredit(balance, company, "debit");
            } else System.out.println("Sorry there is no sufficient balance !!!!! try again.......");
        } else if (operation.equals("credit")) {
            long depositingAmount = sc.nextLong();
            long balance = totalAmount + depositingAmount;
            System.out.println("Amount successfully credited !!!! Available balance amount is : " + balance);
            account.valueOfAccountAfterDebitOrCredit(balance, company, "credit");
        }
    }

    public static void sellingAndBuyingDetails(int option, String choice) {
        switch (option) {
            case 1:
                System.out.println("===================== YOU HAVE OPTED TCS ====================");
                System.out.println("\nthe available no of shares for TCS : " + stockDetails.getSharesTcs() + "\n" +
                        "price for each share : " + stockDetails.getSharePriceTcs());
                System.out.println("How many shares  : ");
                int requiredShares = sc.nextInt();
                if (requiredShares <= stockDetails.getSharesTcs()) {
                    long payment = requiredShares * stockDetails.getSharePriceTcs();
                    if (choice.equals("buy"))
                        System.out.println("Stocks are available .......Amount to be payed : " + payment);
                    else if (choice.equals("sell"))
                        System.out.println("Stocks are available .......Amount you will get : " + payment);
                } else
                    System.out.println("Stocks not available");
                int sharesRemaining = stockDetails.getSharesTcs() - requiredShares;
                account.saveData(sharesRemaining, "tcs");
                break;
            case 2:
                System.out.println("===================== YOU HAVE OPTED WIPRO ====================");
                System.out.println("\nthe available no of shares for WIPRO : " + stockDetails.getSharesWipro() + "\n" +
                        "price for each share : " + stockDetails.getSharePriceWipro());
                System.out.println("How many shares  : ");
                requiredShares = sc.nextInt();
                if (requiredShares <= stockDetails.getSharesWipro()) {
                    long payment = requiredShares * stockDetails.getSharePriceWipro();
                    if (choice.equals("buy"))
                        System.out.println("Stocks are available .......Amount to be payed : " + payment);
                    else if (choice.equals("sell"))
                        System.out.println("Stocks are available .......Amount you will get : " + payment);
                } else
                    System.out.println("Stocks not available");
                sharesRemaining = stockDetails.getSharesWipro() - requiredShares;
                account.saveData(sharesRemaining, "wipro");
                break;
            case 3:
                System.out.println("===================== YOU HAVE OPTED BOSCH ====================");
                System.out.println("\nthe available no of shares for BOSCH : " + stockDetails.getSharesBosch() + "\n" +
                        "price for each share : " + stockDetails.getSharePriceBosch());
                System.out.println("How many shares  : ");
                requiredShares = sc.nextInt();
                if (requiredShares <= stockDetails.getSharesBosch()) {
                    long payment = requiredShares * stockDetails.getSharePriceBosch();
                    if (choice.equals("buy"))
                        System.out.println("Stocks are available .......Amount to be payed : " + payment);
                    else if (choice.equals("sell"))
                        System.out.println("Stocks are available .......Amount you will get : " + payment);
                } else
                    System.out.println("Stocks not available");
                sharesRemaining = stockDetails.getSharesBosch() - requiredShares;
                account.saveData(sharesRemaining, "bosch");
                break;
            default:
                break;
        }
    }

    public static void savingData(int sharesRemaining, String company) {
        if (company.equals("tcs"))
            stockDetails.setSharesTcs(sharesRemaining);
        else if (company.equals("wipro"))
            stockDetails.setSharesWipro(sharesRemaining);
        else if (company.equals("tcs"))
            stockDetails.setSharesTcs(sharesRemaining);
    }

    public void printingReport() {
        long totalShares = stockDetails.getSharesTcs() * stockDetails.getSharePriceTcs();
        stockDetails.setTotalValueOfSharesTcs(totalShares);
        System.out.println("No of shares remaining : " + stockDetails.getSharesTcs() + "\nShare price : " + stockDetails.getSharePriceTcs() + "\nTotal value of shares remaining : " + stockDetails.getTotalValueOfSharesTcs());
        System.out.println("\n--------------------------------------------------- Wipro --------------------------------------------------");
        totalShares = stockDetails.getSharesTcs() * stockDetails.getSharePriceWipro();
        stockDetails.setTotalValueOfSharesWipro(totalShares);
        System.out.println("No of shares remaining : " + stockDetails.getSharesWipro() + "\nShare price : " + stockDetails.getSharePriceWipro() + "\nTotal value of shares remaining : " + stockDetails.getTotalValueOfSharesWipro());
        System.out.println("\n--------------------------------------------------- Bosch --------------------------------------------------");
        totalShares = stockDetails.getSharesBosch() * stockDetails.getSharePriceBosch();
        stockDetails.setTotalValueOfSharesBosch(totalShares);
        System.out.println("No of shares remaining : " + stockDetails.getSharesBosch() + "\nShare price : " + stockDetails.getSharePriceWipro() + "\nTotal value of shares remaining : " + stockDetails.getTotalValueOfSharesBosch());
    }
}

