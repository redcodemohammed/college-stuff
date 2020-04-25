package homeworks.theoretical.lec_6;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int rounds = 30;
        while (count < rounds) {
            System.out.printf("Please enter the %s number: ", count + 1);
            int num = input.nextInt();
            sum += num;
            count++;
        }
        System.out.printf("The sum of the numbers is %s\n", sum);
        System.out.printf("The average of the numbers is %s", sum / rounds);

        input.close();
    }
}
