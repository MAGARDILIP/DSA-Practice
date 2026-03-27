class AutoCleanerThread extends Thread {
    ToDoList list;

    AutoCleanerThread(ToDoList list) {
        this.list = list;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(50000);
                list.removeCompletedTasks();
               //1System.out.println("[AutoCleaner] Cleanup done");
            }
        } catch (Exception e) {
            System.out.println("Cleaner stopped");
        }
    }
}
