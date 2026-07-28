public class TaskLinkedList {
    
    
    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskLinkedList() {
        this.head = null;
    }

    
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added: " + task.getTaskName());
    }

    
    public Task searchTask(String taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId)) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null; 
    }

    
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        System.out.println("=== Task List ===");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
        System.out.println("=================");
    }

    
    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        
        if (head.task.getTaskId().equals(taskId)) {
            String removedName = head.task.getTaskName();
            head = head.next;
            System.out.println("Task deleted: " + removedName);
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.task.getTaskId().equals(taskId)) {
                String removedName = curr.task.getTaskName();
                prev.next = curr.next; 
                System.out.println("Task deleted: " + removedName);
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task with ID: " + taskId + " not found.");
    }
}
