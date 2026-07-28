public class ProxyTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Proxy Pattern ===");

        Image image1 = new ProxyImage("landscape_hd.png");
        Image image2 = new ProxyImage("portrait_4k.jpg");

        
        System.out.println("--- Image 1: First Display (Expect network latency) ---");
        long startTime = System.currentTimeMillis();
        image1.display();
        System.out.println("First display duration: " + (System.currentTimeMillis() - startTime) + "ms\n");

        
        System.out.println("--- Image 1: Second Display (Expect caching / instant display) ---");
        startTime = System.currentTimeMillis();
        image1.display();
        System.out.println("Second display duration: " + (System.currentTimeMillis() - startTime) + "ms\n");

        
        System.out.println("--- Image 2: First Display ---");
        image2.display();
        System.out.println();

        System.out.println("=== Proxy Pattern Test Complete ===");
    }
}
