import java.util.*;

/**
 * palindromeString
 */
public class palindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = "";
        System.out.println("Enter string: ");
        String inp = sc.nextLine();
        int len = inp.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + inp.charAt(i);
        }
        if (inp.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }

    }
}