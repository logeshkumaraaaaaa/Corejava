package looping;

public class WhileLoopExample {

    public void printNumbers() {
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
           i++;
        }
        
       
    }

    public static void main(String[] args) {
        WhileLoopExample example = new WhileLoopExample();
        example.printNumbers();
    }
}
