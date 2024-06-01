import java.util.Scanner;

public class InterleaveStrings {
    public static String interleaveStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            result.append(a.charAt(i++));
            result.append(b.charAt(j++));
        }

        // Append remaining characters of string a
        while (i < a.length()) {
            result.append(a.charAt(i++));
        }

        // Append remaining characters of string b
        while (j < b.length()) {
            result.append(b.charAt(j++));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();

        String result = interleaveStrings(a, b);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
