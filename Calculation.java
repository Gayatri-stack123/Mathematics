public class Calculation {
    private int num1;
    private int num2;

    // Constructor
    public Calculation(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    // Method for addition
    public int add() {
        return num1 + num2;
    }

    // Method for subtraction
    public int subtract() {
        return num1 - num2;
    }

    // Method for multiplication
    public int multiply() {
        return num1 * num2;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Calculator using the constructor
        Calculation calc = new Calculation(10, 5);

        // Perform operations
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
    }
    
}
