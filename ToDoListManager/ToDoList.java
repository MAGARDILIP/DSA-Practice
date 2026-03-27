import java.util.ArrayList;

class ToDoList {
    ArrayList<Task> tasks = new ArrayList<>();

    void addTask(String name) {
        tasks.add(new Task(name));
    }

    void markTaskCompleted(int index) {
      
        if (index >= 0 && index < tasks.size())
            tasks.get(index).markCompleted();
        else
            System.out.println("Invalid task number");
    }

    void showTasks() {
        System.out.println("\n--- Tasks ---");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i+1 + ". " +
                    tasks.get(i).taskName + " - " +
                    tasks.get(i).getStatus());
        }
    }

    void removeCompletedTasks() {
        tasks.removeIf(t -> t.isCompleted);
    }

    int getPendingCount() {
        int count = 0;
        System.out.println("Pending tasks:");
        for (Task t : tasks) {
            if (!t.isCompleted)
              
                count++;
                System.out.println(count +":" +  t.taskName);
        }
        return count;
    }
}
