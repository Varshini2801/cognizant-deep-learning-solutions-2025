public class MVCApp {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student("Alice", "101", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Display initial data
        controller.updateView();

        // Update model via controller
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");

        // Display updated data
        System.out.println("\nAfter Update:");
        controller.updateView();
    }
}
