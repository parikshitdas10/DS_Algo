public class Solution {

    public int solution(String S) {
        // write your code
        int a = 0;
        if (S.length() < 2 || S.indexOf('H') == -1 || S.indexOf('-') == -1)
            return -1;
        StringBuilder b = new StringBuilder(S);
        int l = b.length();
        if (b.charAt(0) == 'H') {
            if (b.charAt(1) == 'H')
                return -1;
            else
                b = b.replace(1, 2, "T");
        }
        if (b.charAt(l - 1) == 'H') {
            if (b.charAt(l - 2) == 'H')
                return -1;
            else
                b = b.replace(l - 2, l - 1, "T");
        }

        for (int i = 1; i < l - 1; i++) {
            if (b.charAt(i) == 'H') {
                if (b.charAt(i - 1) == 'H' && b.charAt(i + 1) == 'H')
                    return -1;
                if (b.charAt(i - 1) != 'T' && b.charAt(i + 1) != 'T') {
                    if (b.charAt(i + 1) == '-')
                        b = b.replace(i + 1, i + 2, "T");
                    else
                        b = b.replace(i - 1, i, "T");
                }
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'T')
                a++;
        }
        if (a == 0)
            a = -1;
        return a;
    }
}
