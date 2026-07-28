import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        System.out.println("=== Testing E-commerce Search Function ===");

        
        Product[] products = {
            new Product("P105", "Wireless Mouse", "Electronics"),
            new Product("P101", "Mechanical Keyboard", "Electronics"),
            new Product("P104", "USB-C Hub", "Accessories"),
            new Product("P102", "Gaming Monitor", "Electronics"),
            new Product("P103", "Noise Cancelling Headphones", "Audio")
        };

        
        System.out.println("--- Linear Search Test ---");
        String targetId = "P104";
        Product resultLinear = SearchAlgorithms.linearSearch(products, targetId);
        System.out.println("Searching for ID: " + targetId);
        if (resultLinear != null) {
            System.out.println("Found (Linear): " + resultLinear);
        } else {
            System.out.println("Product not found (Linear).");
        }
        System.out.println();

        
        System.out.println("Sorting products for Binary Search...");
        Arrays.sort(products);
        System.out.println("Sorted products:");
        for (Product p : products) {
            System.out.println("  " + p);
        }
        System.out.println();

        
        System.out.println("--- Binary Search Test ---");
        Product resultBinary = SearchAlgorithms.binarySearch(products, targetId);
        System.out.println("Searching for ID: " + targetId);
        if (resultBinary != null) {
            System.out.println("Found (Binary): " + resultBinary);
        } else {
            System.out.println("Product not found (Binary).");
        }

        System.out.println("=== E-commerce Search Function Test Complete ===");
    }
}
