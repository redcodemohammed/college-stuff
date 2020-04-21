package random_stuff;

import java.util.Scanner;

/**
 * Challenge
 */
public class Challenge {

    public static void main(String[] args) {
        // create a new scanner object:
        Scanner input = new Scanner(System.in);

        // get user input:
        System.out.print("Please enter a number in the range 2-15: ");
        int num = input.nextInt();

        // check if the input is valid:
        if (num > 15 || num < 2)
            System.out.println("Invalid input.");
        else {
            while (num >= 0) {
                System.out.println(num);
                num--;
            }
        }

        input.close();
    }
}
