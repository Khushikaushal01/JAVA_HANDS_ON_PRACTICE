public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Employee Management System ===");

        EmployeeManager em = new EmployeeManager(3); 

        
        Employee e1 = new Employee("E01", "John Doe", "Software Engineer", 75000);
        Employee e2 = new Employee("E02", "Alice Smith", "Product Manager", 90000);
        Employee e3 = new Employee("E03", "Bob Jones", "HR Specialist", 60000);
        Employee e4 = new Employee("E04", "Charlie Brown", "UX Designer", 70000);

        em.addEmployee(e1);
        em.addEmployee(e2);
        em.addEmployee(e3);
        em.addEmployee(e4); 
        System.out.println();

        
        em.traverseEmployees();
        System.out.println();

        
        System.out.println("--- Searching for Employee E02 ---");
        Employee found = em.searchEmployee("E02");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Employee E02 not found.");
        }
        System.out.println();

        
        System.out.println("--- Deleting Employee E03 ---");
        em.deleteEmployee("E03");
        System.out.println();

        
        em.traverseEmployees();

        System.out.println("=== Employee Management System Test Complete ===");
    }
}
