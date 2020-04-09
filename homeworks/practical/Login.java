package homeworks.practical;

import java.util.Scanner;

/**
 * Login
 */
public class Login {

    public static void main(String[] args) {
        // create a new Scanner:
        Scanner input = new Scanner(System.in);

        // user credentials:
        String username = "mohammed";
        String userPassword = "92001";

        // ask for password:
        System.out.print("Please type your password: ");

        // get the input:
        String password = input.nextLine();

        if (userPassword.equals(password))
            System.out.println("Welcome back " + username);
        else
            System.out.println("Error, you entered wrong password.");

    }
}
