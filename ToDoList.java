import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList {
    private PriorityQueue<Task> taskQueue;

    public ToDoList() {
        taskQueue = new PriorityQueue<>();
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. Show next task");
            System.out.println("3. Quit");

            String option = in.nextLine();

            switch (option) {
                case "1":
                    toDoList.addTask();
                    break;
                case "2":
                    toDoList.printTask();
                    break;
                case "3":
                    running = false;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        in.close();
    }

    public void addTask() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter task priority (1 is highest, 9 is lowest), or type 'Done' to stop:");
            String priorityInput = in.nextLine();
            if (priorityInput.equalsIgnoreCase("Done")) {
                break;
            }

            int priority;
            try {
                priority = Integer.parseInt(priorityInput);
                if (priority < 1 || priority > 9) {
                    System.out.println("Priority must be between 1 and 9.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number for priority.");
                continue;
            }

            System.out.println("Enter task description:");
            String description = in.nextLine();

            Task task = new Task(priority, description);
            taskQueue.add(task);
            System.out.println("Task added: " + task);
        }
    }

    public void printTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("No more tasks.");
        } else {
            Task nextTask = taskQueue.poll(); 
            System.out.println("Next task: " + nextTask);
        }
    }
}
