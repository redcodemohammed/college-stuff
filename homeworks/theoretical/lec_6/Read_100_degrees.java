package homeworks.theoretical.lec_6;

import java.util.Scanner;

/**
 * Read_100_degrees
 */
public class Read_100_degrees {

    public static void main(String[] args) {
        // create a new Scanner:
        Scanner input = new Scanner(System.in);

        // this will keep track of the loops:
        float sum = 0;// add each new degree to this.
        int count = 0; // current loop.
        int rounds = 100;// number of loops.

        // Give the user some instructions:
        System.out.println("The degree should be withing the range 0-100.");

        // Start the loop:
        while (count < rounds) {
            // tell the user to type a degree:
            System.out.printf("Please enter the %s degree: ", count + 1);

            // read the degree:
            float num = input.nextFloat();

            // validate the input:
            if (num < 0 || num > 100) {
                System.out.println("The input was invalid, skipping it.");
                continue;
            }
            sum += num;
            count++;
        }
        float avg = sum / count;
        System.out.printf("\nThe sum was: %s.\nThe average is %s.", sum, avg);
        input.close();
    }
}
