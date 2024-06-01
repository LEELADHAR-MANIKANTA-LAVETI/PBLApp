import java.util.Scanner;

public class RemoveFirstAndLast {
    public static String removeFirstAndLast(String str) {
        if (str.length() <= 2) {
            return ""; 
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeFirstAndLast(input);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
