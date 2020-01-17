package BuilderPattern;

public class MainClass {
    public static void main(String[] args) {
        Car c = new Car.CarBuilder().setBrand("BMW").setColor("Black").setEngineType("200cc").build();
        System.out.println(c);
    }
}
