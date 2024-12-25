package operators;

public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int a = 10;  // Initial value of a
        int b = 5;   // Value to use in operations
        
        System.out.println("Initial value of a: " + a);
        
        // '=' Assign value
        a = b;  
        System.out.println("After 'a = b', a = " + a);
        
        // '+=' Add and assign
        a += b;  // a = a + b
        System.out.println("After 'a += b', a = " + a);
        
        // '-=' Subtract and assign
        a -= b;  // a = a - b
        System.out.println("After 'a -= b', a = " + a);
        
        // '*=' Multiply and assign
        a *= b;  // a = a * b
        System.out.println("After 'a *= b', a = " + a);
        
        // '/=' Divide and assign
        a /= b;  // a = a / b
        System.out.println("After 'a /= b', a = " + a);
        
        // '%=' Modulus and assign
        a %= b;  // a = a % b
        System.out.println("After 'a %= b', a = " + a);
    }
}

