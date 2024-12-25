package looping;

public class DoWhileLoopExample {

    public void printNumbers() {
        System.out.println("Using do-while loop:");
        int i = 1;
        do {
            System.out.println("Number: " + i);
            i--;
        } while (i <= 5);
    }

    public static void main(String[] args) {
        DoWhileLoopExample example = new DoWhileLoopExample();
        example.printNumbers();
    }
}
