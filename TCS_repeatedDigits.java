import java.util.*;

// like 33,44, 112 etc. include n1 and n2;
public class TCS_repeatedDigits {
    static boolean Repeated(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        if (set.size() != s.length())
            return true;
        return false;
    }

    static int solution(int n1, int n2) {
        int count = 0;
        String s;
        for (int i = n1; i <= n2; i++) {
            s = Integer.toString(i);
            if (!Repeated(s))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 1, n2 = Integer.MAX_VALUE;
        int c = solution(n1, n2);
        System.out.println(c);
    }
}
