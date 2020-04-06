package homeworks.theoretical;

import java.util.Scanner;

/**
 * BarCode
 */
public class BarCode {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        readItem("first");
        readItem("second");
        input.close();
    }

    static void readItem(String n) {
        System.out.printf("\nEnter the bar code of the %s item: ", n);
        String barCode = input.nextLine();

        System.out.printf("Enter the price of the %s item: ", n);
        String price = input.nextLine();

        System.out.printf("The bar code of the %s item is: %s, it’s price is: %s Iraqi Dinner\n", n, barCode, price);
    }
}
