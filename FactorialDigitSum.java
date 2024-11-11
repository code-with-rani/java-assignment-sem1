import java.util.Scanner;

public class FactorialDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("Factorial: " + factorial);
            
            int digitSum = calculateDigitSum(factorial);
            System.out.println("Sum of digits: " + digitSum);
        }
    }

    
    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int calculateDigitSum(long number) {
        int digitSum = 0;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }
        return digitSum;
    }
}

