import java.util.Scanner;
// import java.util.Arrays;

public class Calculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        if (args.length > 0 && (args[0].equals("-h") || args[0].equals("help")))
            System.out.println(help());
        else {
            System.out.println("This is a simple calculator app.");
            System.out.println("Type -h for help, and -q to end.");
            System.out.println();

            while (input.hasNextLine()) {
                // get next line:
                String[] nextLine = input.nextLine().split(" ");

                // check if the user asked for help:
                if (nextLine[0].equals("-h") || nextLine[0].equals("help"))
                    System.out.println(help());

                // check if the user wants to exit:
                else if (nextLine[0].equals("exit") || nextLine[0].equals("-q"))
                    break;

                // input format <arg1> <operation> <arg2>
                else if (nextLine.length == 3) {
                    String arg1, operation, arg2;
                    arg1 = nextLine[0];
                    operation = nextLine[1];
                    arg2 = nextLine[2];

                    // calculate the result and print it:
                    int result = calculate(arg1, operation, arg2);
                    System.out.println(result);
                } else
                    System.out
                            .println("The input was invalid, make sure you put spaces between operation and it's args");
            }
        }
    }

    static String help() {
        return "\ninput format: <arg1> <operation> <arg2>\noperation can be\n'+' for addition\n'-' for subtraction\n"
                + "'/' for division and\n'*' for multiplication.\n\narg1 and arg2 can be any valid integers\ncreated by Mohammed Wisam.";
    }

    static int calculate(String arg1, String operation, String arg2) {
        try {
            int intArg1 = Integer.parseInt(arg1);
            int intArg2 = Integer.parseInt(arg2);

            int result = 0;

            switch (operation) {
                case "+":
                    result = intArg1 + intArg2;
                    break;
                case "-":
                    result = intArg1 - intArg2;
                    break;
                case "/":
                    result = intArg1 / intArg2;
                    break;
                case "*":
                    result = intArg1 * intArg2;
                    break;
                default:
                    break;
            }

            return result;
        } catch (Exception e) {
            System.out.println("something went wrong, maybe your entered invalid input, try -h");
        }
        return 0;
    }
}
