import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        long[] fibSequence = fibonacci(n);

        System.out.println("Fibonacci Sequence:");
        printArray(fibSequence);
    }

    public static long[] fibonacci(int n) {
        long[] fib = new long[n];
        fib[0] = 0;
        if (n > 1) {
            
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }

    public static void printArray(long[] arr) {
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

