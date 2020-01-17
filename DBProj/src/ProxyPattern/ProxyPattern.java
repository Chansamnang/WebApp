package ProxyPattern;

public class ProxyPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("Photo.jpg");
        image.DisplayImage();
    }
}
