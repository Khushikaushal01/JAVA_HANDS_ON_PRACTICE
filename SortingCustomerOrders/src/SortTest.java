public class SortTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Customer Order Sorting ===");

        
        Order[] ordersBubble = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 89.99),
            new Order("O003", "Charlie", 1200.00),
            new Order("O004", "David", 450.00),
            new Order("O005", "Eve", 75.25)
        };

        Order[] ordersQuick = ordersBubble.clone();

        
        System.out.println("--- Bubble Sort ---");
        BubbleSort.sort(ordersBubble);
        for (Order o : ordersBubble) {
            System.out.println(o);
        }
        System.out.println();

        
        System.out.println("--- Quick Sort ---");
        QuickSort.sort(ordersQuick);
        for (Order o : ordersQuick) {
            System.out.println(o);
        }

        System.out.println("=== Customer Order Sorting Test Complete ===");
    }
}
