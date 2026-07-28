public class DITest {
    public static void main(String[] args) {
        System.out.println("=== Testing Dependency Injection ===");

        
        CustomerRepository customerRepo = new CustomerRepositoryImpl();

        
        CustomerService customerService = new CustomerService(customerRepo);

        
        System.out.println("--- Finding Customer ID 1 ---");
        String customer1 = customerService.getCustomerName(1);
        System.out.println(customer1);
        System.out.println();

        System.out.println("--- Finding Customer ID 2 ---");
        String customer2 = customerService.getCustomerName(2);
        System.out.println(customer2);
        System.out.println();

        System.out.println("--- Finding Customer ID 3 (Non-existent) ---");
        String customer3 = customerService.getCustomerName(3);
        System.out.println(customer3);

        System.out.println("=== Dependency Injection Test Complete ===");
    }
}
