import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int secondLargest = findSecondLargest(numbers);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest number: " + secondLargest);
        } else {
            System.out.println("No second largest number found.");
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE; // Handle edge case
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}

