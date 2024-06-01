import java.util.Scanner;

public class StringConcatenator {
    public static String concatenateAndRemoveDoubleChar(String str1, String str2) {
        String concatenated = str1 + " " + str2;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < concatenated.length(); i++) {
            if (i > 0 && concatenated.charAt(i) == concatenated.charAt(i - 1)) {
                continue; 
            }
            result.append(concatenated.charAt(i));
        }

        return result.toString().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        String result = concatenateAndRemoveDoubleChar(str1, str2);
        
        System.out.println("Result: " + result);

        scanner.close();
    }
}
