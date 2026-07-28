import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    
    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with ID: " + product.getProductId() + " already exists. Use update instead.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product added successfully: " + product.getProductName());
        }
    }

    
    public void updateProduct(String productId, Product updatedProduct) {
        if (products.containsKey(productId)) {
            products.put(productId, updatedProduct);
            System.out.println("Product updated successfully: " + updatedProduct.getProductName());
        } else {
            System.out.println("Product with ID: " + productId + " does not exist in inventory.");
        }
    }

    
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            Product removed = products.remove(productId);
            System.out.println("Product deleted successfully: " + removed.getProductName());
        } else {
            System.out.println("Product with ID: " + productId + " does not exist in inventory.");
        }
    }

    
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("=== Current Inventory ===");
            for (Product p : products.values()) {
                System.out.println(p);
            }
            System.out.println("=========================");
        }
    }
}
