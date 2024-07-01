import javax.swing.*;
import java.util.regex.Pattern;

public class Register {
    private String username;
    private String password;
    private String firstname;
    private String lastname;

    public void registerUser() {
        // Prompt for username
        username = JOptionPane.showInputDialog(null, "Please Enter your Username:");
        if (checkUsername(username)) {
            JOptionPane.showMessageDialog(null, "Username Successfully Captured");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return;
        }

        // Prompt for password
        password = JOptionPane.showInputDialog(null, "Please Enter your Password:");
        if (passwordComplexityCheck(password)) {
            JOptionPane.showMessageDialog(null, "Password Successfully Captured.");
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            return;
        }

        // Prompt for first name
        firstname = JOptionPane.showInputDialog(null, "Enter your first name:");

        // Prompt for last name
        lastname = JOptionPane.showInputDialog(null, "Enter your last name:");

        // Handle the registration logic
        register();
    }

    private boolean checkUsername(String username) {
        return username.length() <= 5 && username.contains("_");
    }

    private boolean passwordComplexityCheck(String password) {
        return password.length() >= 8 &&
                Pattern.compile("[A-Z]").matcher(password).find() &&
                Pattern.compile("[0-9]").matcher(password).find();
    }

    private void register() {
        JOptionPane.showMessageDialog(null, "User Successfully Registered: " + username + ", " + firstname + " " + lastname);
        Login login = new Login();
        login.loginUser();
    }
}



