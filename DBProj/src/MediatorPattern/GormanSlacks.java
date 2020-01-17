package MediatorPattern;

public class GormanSlacks extends Colleague {
    public GormanSlacks(Mediator newMediator){
        super(newMediator);

        System.out.println("Gorman Slack signed up for the Exchange\n");
    }
}
