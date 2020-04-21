package random_stuff;

import java.util.Scanner;

/**
 * Challenge2
 */
public class Challenge2 {

    public static void main(String[] args) {
        // create a new scanner object:
        Scanner input = new Scanner(System.in);

        // get user input:
        System.out.print("Please enter a number in the range 2-15: ");
        int num = input.nextInt();

        // get output type:
        System.out.print("Please select one: Even, Odd, All: ");
        String type = input.next();

        // check if the input is valid:
        if (num > 15 || num < 2)
            System.out.println("Invalid input.");
        else {
            while (num >= 0) {
                boolean exit = false;
                int current = num;
                num--;
                switch (type) {
                    case "Even":
                        if (current % 2 == 0)
                            System.out.println(current);
                        else
                            continue;
                        break;
                    case "Odd":
                        if (current % 2 != 0)
                            System.out.println(current);
                        else
                            continue;
                        break;
                    case "All":
                        System.out.println(current);
                        break;
                    default:
                        exit = true;
                        break;
                }
                if (exit) {
                    System.out.println("You entered an invalid type.");
                    break;
                }
            }
        }

        input.close();
    }
}
