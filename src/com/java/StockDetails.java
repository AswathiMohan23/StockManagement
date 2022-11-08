package com.java;

public class StockDetails {
    private String stockName;
    private int shares;
    private long sharePrice;

    @Override
    public String toString() {
        return "StockDetails{" +
                "stockName='" + stockName + '\'' +
                ", shares=" + shares +
                ", sharePrice=" + sharePrice +
                '}';
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public long getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(long sharePrice) {
        this.sharePrice = sharePrice;
    }
}