public class EmployeeManager {
    static Employee[] employees = new Employee[100]; // max 100 employees
    static int count = 0;

    public static void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
            System.out.println("Employee added: " + e.name);
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public static void traverseEmployees() {
        System.out.println("\n-- All Employees --");
        for (int i = 0; i < count; i++) {
            employees[i].printDetails();
        }
    }

    public static Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public static void deleteEmployee(int id) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--count] = null;
            System.out.println("Employee with ID " + id + " deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        addEmployee(new Employee(1, "Varshini", "Manager", 70000));
        addEmployee(new Employee(2, "Anil", "Developer", 55000));
        addEmployee(new Employee(3, "Divya", "Tester", 45000));

        traverseEmployees();

        System.out.println("\n-- Searching for Employee ID 2 --");
        Employee e = searchEmployee(2);
        if (e != null) {
            e.printDetails();
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\n-- Deleting Employee ID 3 --");
        deleteEmployee(3);

        traverseEmployees();
    }
}
