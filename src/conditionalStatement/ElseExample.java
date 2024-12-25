package conditionalStatement;

public class ElseExample {

    public static void main(String[] args) {
        int number = 5;
        checkElseExample(number);
    }

    // Method demonstrating `if`, `else if`, and `else` statements
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

