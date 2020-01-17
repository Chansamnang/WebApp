package MediatorPattern;

public class TestStockMediator {
    public static void main(String[] args) {
        StockMediator nysc = new StockMediator();
        GormanSlacks broker = new GormanSlacks(nysc);
        JTPoorman broker2 = new JTPoorman(nysc);

        broker.saleOffer("Microsoft",100);
        broker.saleOffer("Google", 50);

        broker2.buyOffer("Microsoft",100);
        broker2.saleOffer("NRG", 10);

        broker.buyOffer("NRG", 10);

        nysc.getStockOfferings();
    }
}
