package FactoryDesignPattern;

public class CarFactory {
    public static Car getCar(String carName){
        if(carName.equals("Audi")){ //we should not put the == because it return the object
            return new Audi();
        } else if(carName.equals("Tesla")){
            return new Tesla();
        } else{
            return null;
        }
    }
}
