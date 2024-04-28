import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleNumberMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleNumberMath calculator = new DoubleNumberMath();

        while (true) {
            try {
                System.out.print("Enter the first double: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second double: ");
                double num2 = scanner.nextDouble();

                // Display the results of arithmetic operations
                System.out.println("Sum: " + calculator.add(num1, num2));
                System.out.println("Difference: " + calculator.subtract(num1, num2));
                System.out.println("Product: " + calculator.multiply(num1, num2));
                System.out.println("Quotient: " + calculator.divide(num1, num2));
                System.out.println("Division Remainder: " + calculator.remainder(num1, num2));

                break; // Exit loop after successful operations
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid double values.");
                scanner.nextLine(); // Clear the buffer
            }
        }
        scanner.close();
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double remainder(double a, double b) {
        return a % b;
    }
}
