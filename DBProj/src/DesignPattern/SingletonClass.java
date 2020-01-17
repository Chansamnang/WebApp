package DesignPattern;

class SingletonClass{
    private int id; // the reason why we make private var because we want to ensure the security
    private String name;
//    static SingletonClass s = new SingletonClass(); //this is called early instantiate
    //The reasons are first we don't want other class to create object for this class and it is call the early singleton
    //design pattern and it means that our object is already to use
    private SingletonClass (){}
    private static SingletonClass s  = null;
    public static SingletonClass getObj(){
        Object lock1 = new Object();
        Object lock2 = new Object();
        synchronized (lock1){
            if(s == null)
                s = new SingletonClass(); //this is called late instantiate or lazy
        }
        synchronized (lock2){
            System.out.println("Hello");
            System.out.println("Hi");
        }
        return s;
    }
    public void print(){
        System.out.println("ID : " + id +" Name: " + name);
    }
}