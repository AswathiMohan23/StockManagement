package com.java;

public interface IStockAccount{
    double valueOfAccountAfterDebitOrCredit(long balance, String company,String operation); // total value of account in dollars
    void buyShares();
    void sellShares();

    void buyOrSellShares();
    void saveData(int sharesRemaining,String company);
    void printReport();
}
