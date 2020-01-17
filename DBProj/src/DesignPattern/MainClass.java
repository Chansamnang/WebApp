package DesignPattern;

public class MainClass {
    static SingletonClass sc1 = null;
    static SingletonClass sc2 = null;
    public static void main(String[] args) {
//        SingletonClass s = new SingletonClass().getObj();
//        System.out.println(s);
//        s.print();
//        s = SingletonClass.getObj();
//        System.out.println(s);
        Thread t1 = new Thread(() -> sc1 = SingletonClass.getObj());
        Thread t2 = new Thread(() -> sc2 = SingletonClass.getObj());
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){}
        System.out.println(sc1);
        System.out.println(sc2);
    }
}
