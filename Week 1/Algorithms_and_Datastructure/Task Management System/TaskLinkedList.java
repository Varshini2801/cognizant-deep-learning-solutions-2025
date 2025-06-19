public class TaskLinkedList {
    class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
        }
    }

    private Node head;

    // Add task at the end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Task added: " + task.taskName);
    }

    // Traverse all tasks
    public void traverseTasks() {
        Node temp = head;
        System.out.println("\n-- All Tasks --");
        while (temp != null) {
            temp.task.printDetails();
            temp = temp.next;
        }
    }

    // Search by taskId
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId)
                return temp.task;
            temp = temp.next;
        }
        return null;
    }

    // Delete by taskId
    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.task.taskId == taskId) {
                prev.next = curr.next;
                System.out.println("Task with ID " + taskId + " deleted.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task not found.");
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Write Backend", "In Progress"));
        taskList.addTask(new Task(3, "Test Features", "Not Started"));

        taskList.traverseTasks();

        System.out.println("\n-- Searching for Task ID 2 --");
        Task found = taskList.searchTask(2);
        if (found != null) found.printDetails();
        else System.out.println("Task not found.");

        System.out.println("\n-- Deleting Task ID 1 --");
        taskList.deleteTask(1);

        taskList.traverseTasks();
    }
}
