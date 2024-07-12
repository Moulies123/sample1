import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Sine (sin)");
            System.out.println("8. Cosine (cos)");
            System.out.println("9. Tangent (tan)");
            System.out.println("10. Logarithm (log)");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 11) {
                System.out.println("Exiting calculator...");
                break;
            }

            double num1, num2;

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            if (choice > 4) { // Operations requiring only one number
                System.out.print("Enter second number (if applicable, press 0): ");
                num2 = scanner.nextDouble();
            } else {
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            }

            double result = calculate(choice, num1, num2);
            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    public static double calculate(int choice, double num1, double num2) {
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return num1 / num2;
            case 5:
                return Math.pow(num1, num2);
            case 6:
                if (num1 < 0) {
                    throw new IllegalArgumentException("Square root of negative number");
                }
                return Math.sqrt(num1);
            case 7:
                return Math.sin(num1);
            case 8:
                return Math.cos(num1);
            case 9:
                return Math.tan(num1);
            case 10:
                return Math.log(num1); // Natural logarithm (base-e)
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }
}

