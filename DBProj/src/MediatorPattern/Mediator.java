package MediatorPattern;
//This mediator is going to handle of all these colleagues
public interface Mediator {
    void saleOffer(String stock, int shares, int collCode);
    void buyOffer(String stock, int shares, int collCode);
    void addColleague(Colleague colleague); //this method is going to be pass a colleague so that we're able to track all of those colleagues
}
