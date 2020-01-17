package MediatorPattern;

public class StockOffer {
    private int stockShares = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;

    public StockOffer(int numOfShare, String stock, int collCode ){
        stockShares = numOfShare;
        stockSymbol = stock;
        colleagueCode = collCode;
    }

    public int getStockShares(){
        return stockShares;
    }
    public String getStockSymbol(){
        return stockSymbol;
    }
    public int getCollCode(){
        return colleagueCode;
    }
}
