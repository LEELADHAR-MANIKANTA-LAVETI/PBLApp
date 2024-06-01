import java.util.Scanner;

public class RemoveStarAndAdjacent {
    public static String removeStarAndAdjacent(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                // Skip characters left and right of *
                i++;
                if (i < str.length()) {
                    i++;
                }
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (with * in it): ");
        String input = scanner.nextLine();

        String result = removeStarAndAdjacent(input);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
