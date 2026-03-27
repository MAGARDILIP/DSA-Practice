class Task {
    String taskName;
    boolean isCompleted;

    Task(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }

    void markCompleted() {
        isCompleted = true;
    }

    String getStatus() {
        if (isCompleted)
            return "Completed";
        else
            return "Pending";
    }
}
