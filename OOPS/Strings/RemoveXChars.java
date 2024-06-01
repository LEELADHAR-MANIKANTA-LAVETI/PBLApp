import java.util.Scanner;

public class RemoveXChars {
    public static String removeXFromEnds(String str) {
        if (str.length() == 0) {
            return str; // Return the string unchanged if it's empty
        }
        if (str.charAt(0) == 'x') {
            str = str.substring(1); // Remove the first character if it's 'x'
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1); // Remove the last character if it's 'x'
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeXFromEnds(input);

        System.out.println("Result: " + result);

        scanner.close();
    }
}