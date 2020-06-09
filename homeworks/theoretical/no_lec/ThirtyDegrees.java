package homeworks.theoretical.no_lec;

import java.util.Scanner;

/**
 * ThirtyDegrees
 */
public class ThirtyDegrees {

    public static void main(String[] args) {
        // create a new scanner:
        Scanner input = new Scanner(System.in);

        // array for 10 students:
        int[] degrees = new int[10];

        // fill the array
        for (int i = 0; i < degrees.length; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.printf("Please enter degree %s for student %s: ", j, i);
                sum += input.nextInt();
            }

            degrees[i] = sum;
        }

        // close the scanner:
        input.close();

        // print the array:
        for (int i = 0; i < degrees.length; i++) {
            System.out.printf("Summation for student %s is %s\n", i, degrees[i]);
        }
    }
}
