public class MVCTest {
    public static void main(String[] args) {
        System.out.println("=== Testing MVC Pattern ===");

        
        Student model = retrieveStudentFromDatabase();

        
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(model, view);

        
        System.out.println("--- Initial Student View ---");
        controller.updateView();
        System.out.println();

        
        System.out.println("--- Updating Student Grade and Name via Controller ---");
        controller.setStudentName("Khushi Kaushal");
        controller.setStudentGrade("A+");

        
        System.out.println("--- Updated Student View ---");
        controller.updateView();

        System.out.println("=== MVC Pattern Test Complete ===");
    }

    private static Student retrieveStudentFromDatabase() {
        
        return new Student("John Doe", "101", "B");
    }
}
