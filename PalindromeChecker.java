import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number or string: ");
        String userInput = scanner.nextLine();

        int length = userInput.length();
        int halfway = length / 2;
        boolean isPalindrome = true;

        for (int i = 0; i < halfway; i++) {
            if (userInput.charAt(i) != userInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(userInput + " is a palindrome!");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }

    }
}
    