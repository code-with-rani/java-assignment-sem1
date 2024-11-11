import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second1 number:");
            double num2 = scanner.nextDouble();

            if (choice == 1) System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            else if (choice == 2) System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            else if (choice == 3) System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            else if (choice == 4) {
                if (num2 != 0) System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else System.out.println("Error! Division by zero.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
