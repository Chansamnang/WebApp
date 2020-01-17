package Adapter;

interface earphone{
    void listen();
}
class android implements earphone{
    @Override
    public void listen() {
        System.out.println("Listen music on Android");
    }
}
interface airpod{
    void listen();
}
class iphone implements airpod{
    @Override
    public void listen() {
        System.out.println("Listen music on Iphone");
    }
}
class earphone_connector implements earphone{
    private iphone iphone;
    public earphone_connector(iphone iphone){
        this.iphone = iphone;
    }

    @Override
    public void listen() {
        this.iphone.listen();
    }
}
public class test {
    public static void main(String[] args) {
        android S10 = new android();
        S10.listen();

        iphone iphoneX = new iphone();
        iphoneX.listen();

        earphone iphone11 = new earphone_connector(new iphone());
        iphone11.listen();
    }
}
