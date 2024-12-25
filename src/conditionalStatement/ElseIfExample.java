package conditionalStatement;

public class ElseIfExample {

    public static void main(String[] args) {
        int number = 15;
        checkElseIfExample(number);
    }

    // Method demonstrating `if` and `else if` statements
    public static void checkElseIfExample(int num) {
        if (num < 9) {
            System.out.println("Number is greater than 20");
        } else if (num < 10) {
            System.out.println("Number is greater than 10 but less than or equal to 20");
        }
        
        else {
        	System.out.println("If blockk is failure");
        }
        // No else here, only if and else if
    }
}

