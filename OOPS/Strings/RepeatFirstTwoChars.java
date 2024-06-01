import java.util.Scanner;

public class RepeatFirstTwoChars {
    public static String repeatFirstTwoChars(String str) {
        if (str.length() < 2) {
            return "String length must be at least 2";
        }

        String firstTwoChars = str.substring(0, 2);
        int n = str.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(firstTwoChars);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = repeatFirstTwoChars(input);
        
        System.out.println("Result: " + result);

        scanner.close();
    }
}
