package DecoratorPattern;

interface Car{
    int getCost();
    String getDescription();
}

class simpleTesla implements Car{
    @Override
    public int getCost() {
        return 3000;
    }

    @Override
    public String getDescription() {
        return "Simple Car";
    }
}

abstract class teslaDecorator implements Car{
    private Car car;
    public teslaDecorator(Car car){
        this.car = car;
    }
    public String getDescription(){
        return car.getDescription();
    }
    public int getCost(){
        return car.getCost();
    }
}

class TeslaAutoPilot extends teslaDecorator{
    public TeslaAutoPilot(Car car){
        super(car);
    }
    public int getCost(){
        return super.getCost() + 1000;
    }
    public String getDescription(){
        return super.getDescription() + "added autopilot";
    }
}

class TeslaRedColor extends teslaDecorator{
    public TeslaRedColor(Car car){
        super(car);
    }
    public int getCost(){
        return super.getCost() + 500;
    }
    public String getDescription(){
        return super.getDescription() + "added red color";
    }
}

public class Decorator {
    public static void main(String[] args) {
        Car tesla = new TeslaRedColor(new TeslaAutoPilot(new simpleTesla()));
        System.out.println(tesla.getDescription());
    }
}