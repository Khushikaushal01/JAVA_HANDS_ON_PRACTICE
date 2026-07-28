public class InventoryTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Inventory Management System ===");

        Inventory inventory = new Inventory();

        
        Product p1 = new Product("P001", "Laptop", 10, 999.99);
        Product p2 = new Product("P002", "Smartphone", 25, 499.99);
        Product p3 = new Product("P003", "Headphones", 50, 79.99);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        System.out.println();

        
        inventory.displayProducts();
        System.out.println();

        
        System.out.println("--- Updating P002 (Smartphone) ---");
        Product p2Updated = new Product("P002", "Smartphone Pro", 20, 549.99);
        inventory.updateProduct("P002", p2Updated);
        System.out.println();

        
        inventory.displayProducts();
        System.out.println();

        
        System.out.println("--- Deleting P003 (Headphones) ---");
        inventory.deleteProduct("P003");
        System.out.println();

        
        inventory.displayProducts();

        System.out.println("=== Inventory Management System Test Complete ===");
    }
}
