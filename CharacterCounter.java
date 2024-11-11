import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);
        scanner.close();

        int count = countCharacter(input, c);

        System.out.println("Character '" + c + "' appears " + count + " times.");
    }

    /**
     * Counts the occurrences of a character in a string.
     *
     * @param str the input string
     * @param c the character to count
     * @return the count of character occurrences
     */
    public static int countCharacter(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
}
}

