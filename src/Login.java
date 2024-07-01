import javax.swing.*;

public class Login {
    public void loginUser() {

        JOptionPane.showMessageDialog(null, "Redirecting to login...");

        String username = JOptionPane.showInputDialog(null, "Please Enter your Username:");
        String password = JOptionPane.showInputDialog(null, "Please Enter your Password:");


        if (authenticate(username, password)) {
            JOptionPane.showMessageDialog(null, "Login successful for user: " + username);
            TaskApplication taskApplication = new TaskApplication();
            taskApplication.runTaskApplication();
        } else {
            JOptionPane.showMessageDialog(null, "Login failed for user: " + username);
        }
    }
    private boolean authenticate(String username, String password) {

        return "admin".equals(username) && "password".equals(password);
    }

}

