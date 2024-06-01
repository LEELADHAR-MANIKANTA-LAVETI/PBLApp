import java.util.Scanner;

public class RepeatLastNCharacters {
    public static String repeatLastNCharacters(String str, int n) {
        int len = str.length();
        String lastNChars = str.substring(len - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        String result = repeatLastNCharacters(input, n);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
