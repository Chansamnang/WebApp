package TemplatePattern;

public class TemplatePattern {
    public static void main(String[] args) {
        Hosue house = new woodenHouse();
        house.templateMethod();
        house = new ConcreteHouse();
        house.templateMethod();
    }
}
