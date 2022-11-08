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
        readInput("wipro",wiproList);
        readInput("bosch",boschList);
        System.out.println(tcsList+"\n"+boschList+"\n"+wiproList);


    }

    private static void readInput(String company, ArrayList list) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the details of : "+company);
        System.out.println("stockName : "+company);
        list.add(company);
        System.out.println("enter the shares : ");
        list.add(sc.nextInt());
        System.out.println("enter share price : ");
        list.add(sc.nextInt());
        }
}
