package src.com.company;

public class Operation {
    // this is the operation class
    // used to perform various
    // Operations + - / *
    //            ++ -- %
    // a = first number ; b = second number

    // Add +
    public int add(final int a, final int b){
        return a + b;
    }
    // Subtract -
    public int subtract(final int a , final int b){
        return a - b;
    }
    // Multiply *
    public int multiply(final int a , final int b){
        return a * b;
    }
    // Division /
    public int divide(final int a , final int b){
        return a / b;
    }
    //Increment ++
    public int increment(int a){
        return a++;
    }
    // Decrement --
    public int decrement(int a){
        return a--;
    }
    // Modulus %
    public int modulus(final int a , final int b) {
        return a % b;
    }
    public int multadd(final int a, final int b, final int c){
        final int sum = a + b;
        return sum * c;
    }
    public String  message(final String a){
        final String mesg = "whats up";
        return a + mesg;
    }
}

