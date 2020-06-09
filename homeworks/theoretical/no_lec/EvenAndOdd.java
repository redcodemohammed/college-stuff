package homeworks.theoretical.no_lec;

import java.util.Scanner;

/**
 * ArrayOfInt
 */
public class EvenAndOdd {

    public static void main(String[] args) {
        // create a new scanner:
        Scanner input = new Scanner(System.in);

        // create array for 10 int:
        int[] arr = new int[10];

        // loop throw arr items:
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Please enter value for the %s element: ", i);
            arr[i] = input.nextInt();
        }

        // close the scanner:
        input.close();

        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.printf("You entered %s even numbers and %s odd numbers", even, odd);
    }
}
