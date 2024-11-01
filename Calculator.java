import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
        int operation = scanner.nextInt();

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }

        scanner.close();
    }
}
