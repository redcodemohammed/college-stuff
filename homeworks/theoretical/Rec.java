package homeworks.theoretical;

import java.util.Scanner;

/**
 * Rec
 */
public class Rec {

    public static void main(String[] args) {
        // initialize the scanner:
        Scanner input = new Scanner(System.in);

        // ask the user to enter the width:
        System.out.print("Enter the rectangle width: ");
        int width = input.nextInt();

        // ask the user to enter the length:
        System.out.print("Enter the rectangle length: ");
        int length = input.nextInt();

        // draw the rectangle:
        String w = "";
        for (int i = 0; i < width; i++) {
            w += "-";
        }

        // the length:
        String l = "|";
        for (int j = 0; j < width; j++) {
            l += " ";
        }
        l += "|";
        for (int i = 0; i < length - 1; i++) {
            l += "\n|";
            for (int j = 0; j < width; j++) {
                l += " ";
            }
            l += "|";
        }

        System.out.println(w);
        System.out.println(l);
        System.out.println(w);

        input.close();
    }
}
