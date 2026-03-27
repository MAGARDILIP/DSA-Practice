import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ToDoList list = new ToDoList();

        AutoCleanerThread cleaner = new AutoCleanerThread(list);
        cleaner.start();

        int choice;

        do {
            System.out.println("\n1.Add Task");
            System.out.println("2.Mark Completed");
            System.out.println("3.Show Tasks");
            System.out.println("4.Show Pending Count");
            System.out.println("5.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    list.addTask(sc.nextLine());
                    break;

                case 2:
                    list.showTasks();
                    System.out.print("Enter task number: ");
                    list.markTaskCompleted(sc.nextInt());
                    break;

                case 3:
                    list.showTasks();
                    break;

                case 4:
                    System.out.println("Pending: " +
                            list.getPendingCount());
                    break;

                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
