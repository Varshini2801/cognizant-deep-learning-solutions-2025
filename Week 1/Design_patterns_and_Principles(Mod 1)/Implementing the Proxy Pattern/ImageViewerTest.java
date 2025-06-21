public class ImageViewerTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("cat.jpg");
        Image image2 = new ProxyImage("dog.jpg");

        // Image will be loaded from remote server
        image1.display();
        System.out.println();

        // Image already loaded, will use cached version
        image1.display();
        System.out.println();

        // New image, will be loaded
        image2.display();
    }
}
