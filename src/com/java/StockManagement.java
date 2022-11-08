package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
    static ArrayList tcsList=new ArrayList();
    static ArrayList wiproList=new ArrayList();
    static ArrayList boschList=new ArrayList();


    static StockDetails stockDetails=new StockDetails();
    public static void main(String[] args){
        readInput("tcs",tcsList);
        totalValueOfShares("tcs");
        readInput("wipro",wiproList);
        totalValueOfShares("wipro");
        readInput("bosch",boschList);
        totalValueOfShares("bosch");
        System.out.println(tcsList+"\n"+boschList+"\n"+wiproList);



    }

    public static void totalValueOfShares(String company) {
        long totalShares= stockDetails.getShares()* stockDetails.getSharePrice();
        stockDetails.setTotalValueOfShares(totalShares);
        System.out.println("================>>>>>> TotalValue of shares for "+company+ " = "+stockDetails.getTotalValueOfShares());

    }

    private static void readInput(String company, ArrayList list) {
        Scanner sc=new Scanner(System.in);
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
}
