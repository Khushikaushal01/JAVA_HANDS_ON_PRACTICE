public class TaskTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Task Management System ===");

        TaskLinkedList list = new TaskLinkedList();

        
        Task t1 = new Task("T01", "Design Database Schema", "Completed");
        Task t2 = new Task("T02", "Setup Spring Boot App", "In Progress");
        Task t3 = new Task("T03", "Implement Security Filter", "Pending");
        Task t4 = new Task("T04", "Run Integration Tests", "Pending");

        list.addTask(t1);
        list.addTask(t2);
        list.addTask(t3);
        list.addTask(t4);
        System.out.println();

        
        list.traverseTasks();
        System.out.println();

        
        System.out.println("--- Searching for Task T03 ---");
        Task found = list.searchTask("T03");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Task T03 not found.");
        }
        System.out.println();

        
        System.out.println("--- Deleting Task T01 (Head) ---");
        list.deleteTask("T01");
        System.out.println();

        System.out.println("--- Deleting Task T03 (Middle) ---");
        list.deleteTask("T03");
        System.out.println();

        
        list.traverseTasks();

        System.out.println("=== Task Management System Test Complete ===");
    }
}
