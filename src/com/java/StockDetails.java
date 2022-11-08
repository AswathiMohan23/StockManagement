package com.java;

public class StockDetails {
    private String stockName;
    private int shares;
    private long sharePrice;
    private long totalValueOfShares;
    private long totalValueOfSharesTcs;
    private long totalValueOfSharesWipro;
    private long totalValueOfSharesBosch;

    public long getTotalValueOfShares() {
        return totalValueOfShares;
    }

    public void setTotalValueOfShares(long totalValueOfShares) {
        this.totalValueOfShares = totalValueOfShares;
    }

    public long getTotalValueOfSharesTcs() {
        return totalValueOfSharesTcs;
    }

    public void setTotalValueOfSharesTcs(long totalValueOfSharesTcs) {
        this.totalValueOfSharesTcs = totalValueOfSharesTcs;
    }

    public long getTotalValueOfSharesWipro() {
        return totalValueOfSharesWipro;
    }

    public void setTotalValueOfSharesWipro(long totalValueOfSharesWipro) {
        this.totalValueOfSharesWipro = totalValueOfSharesWipro;
    }

    public long getTotalValueOfSharesBosch() {
        return totalValueOfSharesBosch;
    }

    public void setTotalValueOfSharesBosch(long totalValueOfSharesBosch) {
        this.totalValueOfSharesBosch = totalValueOfSharesBosch;
    }

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
