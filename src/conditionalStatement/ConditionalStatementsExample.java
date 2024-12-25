package conditionalStatement;

public class ConditionalStatementsExample {

    public static void main(String[] args) {
        int number = 15;

        checkIfExample(number);
        checkElseIfExample(number);
        checkElseExample(number);
    }

    // Method demonstrating `if` statement
    public static void checkIfExample(int num) {
        if (num > 10) {
            System.out.println("Number is greater than 10");
        }
    }

    // Method demonstrating `else if` statement
    public static void checkElseIfExample(int num) {
        if (num > 20) {
            System.out.println("Number is greater than 20");
        } else if (num > 10) {
            System.out.println("Number is greater than 10 but less than or equal to 20");
        }
    }

    // Method demonstrating `else` statement
    public static void checkElseExample(int num) {
        if (num > 20) {
            System.out.println("Number is greater than 20");
        } else if (num > 10) {
            System.out.println("Number is greater than 10 but less than or equal to 20");
        } else {
            System.out.println("Number is 10 or less");
        }
    }
}
