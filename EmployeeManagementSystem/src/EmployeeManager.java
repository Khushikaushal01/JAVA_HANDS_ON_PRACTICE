public class EmployeeManager {
    private Employee[] employees;
    private int size;
    private int capacity;

    public EmployeeManager(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    
    public void addEmployee(Employee employee) {
        if (size >= capacity) {
            
            capacity *= 2;
            Employee[] temp = new Employee[capacity];
            System.arraycopy(employees, 0, temp, 0, size);
            employees = temp;
            System.out.println("Capacity expanded to " + capacity);
        }
        
        
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employee.getEmployeeId())) {
                System.out.println("Employee with ID: " + employee.getEmployeeId() + " already exists.");
                return;
            }
        }

        employees[size] = employee;
        size++;
        System.out.println("Employee added successfully: " + employee.getName());
    }

    
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    
    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employee records found.");
        } else {
            System.out.println("=== Employee Directory ===");
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
            System.out.println("==========================");
        }
    }

    
    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee with ID: " + employeeId + " not found.");
            return;
        }

        String removedName = employees[index].getName();
        
        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[size - 1] = null; 
        size--;
        System.out.println("Employee deleted successfully: " + removedName);
    }
}
