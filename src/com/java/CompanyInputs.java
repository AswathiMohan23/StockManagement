package com.java;

import java.util.ArrayList;
import java.util.Scanner;

import static com.java.StockManagement.stockDetails;


public class CompanyInputs {
    static Scanner sc=new Scanner(System.in);
    public static void readInputTcs() {
        System.out.println("stockName : tcs");
        stockDetails.setStockName("tcs");
        System.out.println("enter the no of shares : ");
        stockDetails.setSharesTcs(sc.nextInt());
        System.out.println("enter share price : ");
        stockDetails.setSharePriceTcs(sc.nextInt());
        long totalSharesPrice = stockDetails.getSharesTcs() * stockDetails.getSharePriceTcs();
        stockDetails.setTotalValueOfSharesTcs(totalSharesPrice);
        System.out.println("================>>>>>> TotalValue of shares for tcs = " + stockDetails.getTotalValueOfSharesTcs());
    }
    public static void readInputWipro() {
        System.out.println("stockName : wipro");
        stockDetails.setStockName("wipro");
        System.out.println("enter the no of shares : ");
        stockDetails.setSharesWipro(sc.nextInt());
        System.out.println("enter share price : ");
        stockDetails.setSharePriceWipro(sc.nextInt());
        long totalSharesPrice = stockDetails.getSharesWipro() * stockDetails.getSharePriceWipro();
        stockDetails.setTotalValueOfSharesWipro(totalSharesPrice);
        System.out.println("================>>>>>> TotalValue of shares for Wipro = " + stockDetails.getTotalValueOfSharesWipro());
    }
    public static void readInputBosch() {

        System.out.println("stockName : Bosch");
        stockDetails.setStockName("bosch");
        System.out.println("enter the no of shares : ");
        stockDetails.setSharesBosch(sc.nextInt());
        System.out.println("enter share price : ");
        stockDetails.setSharePriceBosch(sc.nextInt());
        long totalSharesPrice = stockDetails.getSharesBosch() * stockDetails.getSharePriceBosch();
        stockDetails.setTotalValueOfSharesBosch(totalSharesPrice);
        System.out.println("================>>>>>> TotalValue of shares for bosch = " + stockDetails.getTotalValueOfSharesBosch());
}
    }

