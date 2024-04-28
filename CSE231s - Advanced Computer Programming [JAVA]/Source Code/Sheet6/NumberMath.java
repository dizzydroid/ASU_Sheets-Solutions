import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberMath calculator = new NumberMath();

        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                int num2 = scanner.nextInt();

                // Display the results of arithmetic operations
                System.out.println("Sum: " + calculator.add(num1, num2));
                System.out.println("Difference: " + calculator.subtract(num1, num2));
                System.out.println("Product: " + calculator.multiply(num1, num2));
                System.out.println("Quotient: " + calculator.divide(num1, num2));
                System.out.println("Division Remainder: " + calculator.remainder(num1, num2));

                break; // Exit loop after successful operations
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid integers.");
                scanner.nextLine(); // Clear the buffer
            } catch (ArithmeticException | DivisionByZeroException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public String divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException(a);
        }
        return String.valueOf(a / b); 
    }

    public int remainder(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException(a, true);
        }
        return a % b;
    }

    public static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(int a) {
            super((a == 0 ? "Undefined quantity" : (a > 0 ? "+infinity" : "-infinity")));
        }

        public DivisionByZeroException(int a, boolean remainder) {
            super("Division remainder: 0");
        }
    }
}
