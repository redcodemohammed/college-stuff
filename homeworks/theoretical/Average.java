package homeworks.theoretical;

import java.util.Scanner;

/**
 * Average
 */
public class Average {

    public static void main(String[] args) {
        // initialize the scanner:
        Scanner input = new Scanner(System.in);

        System.out.println("This app will calculate the average of given degrees.");

        // ask for the maximum value:
        System.out.print("Please enter the maximum possible degree: ");
        int maximumD = input.nextInt();

        // variables to hold total and number of degrees:
        int n = 0;
        int total = 0;

        // the loop that get degrees:
        System.out.print("Please enter your degree: ");
        while (input.hasNextInt()) {
            // get the next int:
            int nextDegrees = input.nextInt();

            // check if ins value is bigger than the maximum:
            if (nextDegrees > maximumD) {
                System.out.print("Given degree is bigger than the maximum, please try again: ");
                continue;
            }

            // increase n and add the degree to the total:
            n++;
            total += nextDegrees;

            // ask the user for the next degree
            System.out.print("Please enter your degree, or type done when done adding degrees: ");
        }
        if (n == 0)
            System.out.println("You didn't enter any degrees.");
        else
            System.out.println("Your average is: " + (total / n));
        input.close();
    }
}
