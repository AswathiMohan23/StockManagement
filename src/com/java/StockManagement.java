package com.java;

import java.util.ArrayList;
import java.util.Scanner;

import static com.java.CompanyInputs.*;
import static com.java.StockManagementMethods.*;

public class StockManagement {

    static IStockAccount iStockAccount;
    static Account account=new Account();

    static Scanner sc=new Scanner(System.in);


    static StockDetails stockDetails=new StockDetails();
    public static void main(String[] args){
        readInputTcs();
        readInputWipro();
        readInputBosch();
        creditAndDebit();
        account.buyOrSellShares();
        account.printReport();

    }

}