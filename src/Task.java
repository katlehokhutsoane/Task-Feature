public class Task {

    public String taskName;
    public String taskDescription;
    public int taskDuration;
    public String taskDeveloperDetails;
    public String taskStatus;
    private String taskID;
    private static int taskNumber = 0; //this is to ensure that the task numbers are auto generated

    public Task(String taskName,
                String taskDescription, String taskDeveloperDetails,
                int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber++;
        this.taskDescription = taskDescription;
        this.taskDeveloperDetails = taskDeveloperDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createtaskID();
    }
    //these are our getters in the blueprint of the class
    public String gettaskID() {
        return taskID;//this returns the information of the taskID
    }

    public void settaskName(String taskName) {
        this.taskName = taskName;//this returns the info of the taskName
    }

    public void settaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;//this assigns the number of the taskNumber
    }

    public void settaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;//this assigns the description of the taskDescription
    }

    public void settaskDeveloperdetails(String taskDeveloperDetails) {
        this.taskDeveloperDetails = taskDeveloperDetails;//this also assigns the taskDeveloperDetails
    }

    public void settaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;//this then assigns the duration of the task
    }


    public void settaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public boolean checktaskDescription(){
        return this.taskDescription.length()<=50;}

    public String createtaskID(){//this is meant to give the last three letters of the developer assigned to the task’s name.
        String developerDetails = taskDeveloperDetails.substring(taskDeveloperDetails.length()-3).toUpperCase();
        developerDetails = taskDeveloperDetails;
        String taskID = taskName + ":" + taskDeveloperDetails;
        return taskID;

    }//this will return in hours meaning that the data type is int it will return the hours
    public int returnTotalHours(){
        return taskDuration;
    }
}




