import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();
        scanner.close();

        printInvertedTriangle(n);
    }

    public static void printInvertedTriangle(int n) {
        int num = n;

        for (int i = n; i >= 1; i--) {
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
    }
}

