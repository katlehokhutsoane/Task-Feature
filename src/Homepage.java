import javax.swing.*;

public class Homepage {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Homepage homepage = new Homepage();
            homepage.showOptions();
        });
    }

    public void showOptions() {
        // Options for the user
        String[] options = {"Register", "Login"};

        // Show the option pane and get the user's choice
        int choice = JOptionPane.showOptionDialog(
                null, "Please select an option:", "Homepage", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        // Redirect based on user's choice
        if (choice == 0) {
            Register register = new Register();
            register.registerUser();
        } else if (choice == 1) {
            Login login = new Login();
            login.loginUser();
        }
    }
}




