package MediatorPattern;

import java.util.ArrayList;

public class StockMediator implements Mediator{
    private ArrayList<Colleague> colleagues; // is going to have all the different colleagues
    private ArrayList<StockOffer> stockBuyOffer; //because there's going to be stock offer
    private ArrayList<StockOffer> stockSellOffer;

    private int colleagueCodes = 0; // we need a way to track these colleagueCode
    public StockMediator() {
        colleagues = new ArrayList<Colleague>();
        stockBuyOffer = new ArrayList<StockOffer>();
        stockSellOffer = new ArrayList<StockOffer>();
    }

    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
        colleagueCodes++;
        newColleague.setCollCode(colleagueCodes);
    }

    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;
        for (StockOffer offer : stockBuyOffer){
            if(offer.getStockSymbol() == stock && offer.getStockShares() == shares){
                System.out.println(shares + " shares of " + stock + " sold to colleague code" + offer.getCollCode());
                stockBuyOffer.remove(offer);
                stockSold = true;
            }
            if(stockSold){
                break;
            }
        }
        if(!stockSold){
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockSellOffer.add(newOffering);
        }
    }

    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false; // check the stock is bought or not
        for (StockOffer offer : stockSellOffer){
            if(offer.getStockSymbol() == stock && offer.getStockShares() == shares){
                System.out.println(shares + " shares of " + stock + " bought buy colleague code" + collCode);
                stockSellOffer.remove(offer);
                stockBought = true;
            }
            if(stockBought){
                break;
            }
        }
        if(!stockBought){
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockBuyOffer.add(newOffering);
        }
    }
    public void getStockOfferings(){
        System.out.println("\nStocks for Sale");
        for(StockOffer offer: stockSellOffer){
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());

        }
        System.out.println("\nStock for Buy Offer");
        for(StockOffer offer: stockBuyOffer){
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());

        }
    }

}
