import javax.swing.JOptionPane;

public class TaskApplication {
    private static Object[] statusOptions = {"To Do", "Doing", "Done"};

    public void runTaskApplication() {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks:"));
        Task[] tasks = new Task[numTasks];

        for (int taskNumber = 0; taskNumber < numTasks; taskNumber++) {
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Choose task status:", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);
            String developerDetails = JOptionPane.showInputDialog("Enter developer details First Name: \n Last Name:");
            String taskName = JOptionPane.showInputDialog("Enter task name:");
            String taskDescription = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters:");
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration in hours:"));

            Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);

            if (task.checktaskDescription()) {
                tasks[taskNumber] = task;
                JOptionPane.showMessageDialog(null, "Task successfully captured:\n" + developerDetails);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                taskNumber--;
            }
        }

        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.returnTotalHours();
        }
        JOptionPane.showMessageDialog(null, "Total task duration: " + totalHours + " hours");
    }
}


