package ProxyPattern;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Load " +fileName);
    }

    @Override
    public void DisplayImage() {
        System.out.println("Display " + fileName);
    }
}
