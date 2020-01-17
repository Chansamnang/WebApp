package TemplatePattern;

public abstract class Hosue {
    abstract void header();
    abstract void body();
    //hook method
    void footer(){
        System.out.println("Build with sand and steel");
    }
    //template method
    public final void templateMethod(){
        footer();
        body();
        header();
    }
}

class woodenHouse extends Hosue{


    @Override
    protected void header() {
        System.out.println("Wooden Roof");
    }

    @Override
    protected void body() {
        System.out.println("Wooden body");
    }
}

class ConcreteHouse extends Hosue{

    @Override
    void header() {
        System.out.println("Concrete Roof");
    }

    @Override
    void body() {
        System.out.println("Build with cement, sand, steel");
    }
}