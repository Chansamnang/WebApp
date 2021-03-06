package ProxyPattern;

public class ProxyImage implements  Image{
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void DisplayImage() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.DisplayImage();
    }
}
