package homeworks.theoretical.lec_6;

import java.util.Scanner;

/**
 * Read_2
 */
public class Read_2 {

    public static void main(String[] args) {
        // create a new Scanner:
        Scanner input = new Scanner(System.in);

        // tell the user what to do:
        System.out.print("Enter a 2 characters word: ");

        // read the 2 chars:
        String word = input.next();
        char char1 = word.charAt(0);
        char char2 = word.charAt(1);

        // check the input:
        if (char1 == '+' && char2 == '*') {
            // this will keep track of the loop:
            int sum = 0;// add each new degree to this.
            int mult = 1; // multiply in each round.
            int count = 0; // current loop.
            int rounds = 10;// number of loops.
            // Start the loop:
            while (count < rounds) {
                // tell the user to type a degree:
                System.out.printf("Please enter the %s degree: ", count + 1);

                // read the num:
                int num = input.nextInt();

                // add and multiply it:
                sum += num;
                mult *= num;

                count++;
            }

            System.out.printf("The sum was: %s.\nAnd the multiplication was: %s.\nDone.", sum, mult);
        } else {
            System.out.println("The characters are wrong.");
        }
        input.close();
    }
}
