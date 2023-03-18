import java.util.Scanner;
import java.lang.Math;

public class hello {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square root");
            System.out.println("6. Power of");

            System.out.println("Select operation:");
            int operator = scanner.nextInt();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            double result;

            switch (operator) {
                case 1:
                    System.out.print("Enter second number: ");
                    double addNum = scanner.nextDouble();
                    result = num1 + addNum;
                    break;

                case 2:
                    System.out.print("Enter second number: ");
                    double subNum = scanner.nextDouble();
                    result = num1 - subNum;
                    break;

                case 3:
                    System.out.print("Enter second number: ");
                    double mulNum = scanner.nextDouble();
                    result = num1 * mulNum;
                    break;

                case 4:
                    System.out.print("Enter second number: ");
                    double divNum = scanner.nextDouble();
                    result = num1 / divNum;
                    break;

                case 5:
                    result = Math.sqrt(num1);
                    break;

                case 6:
                    System.out.print("Enter power: ");
                    double powNum = scanner.nextDouble();
                    result = Math.pow(num1, powNum);
                    break;

                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }
}
