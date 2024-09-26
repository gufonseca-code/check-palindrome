import java.util.Scanner;
import java.util.Stack;

public class PalindromeWords {
    public static String checkPalindrome(String word) {
        Stack<Character> chars = new Stack<>();
        Stack<Character> chars_reversed = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            chars.push(word.charAt(i));
        }

        for (int i = word.length(); i > 0; i--) {
            chars_reversed.push(word.charAt(i - 1));
        }

        if (chars.equals(chars_reversed)) {
            return "Palindrome!";
        }
        return "Not palindrome!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println(checkPalindrome(word));
    }
}
