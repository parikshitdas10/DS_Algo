
public class strDuplicate {
    public static void main(String[] args) {
        String str = "deboleena";
        char c = '0';
        char a;
        char b;
        int count = 0;
        int comp;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            a = str.charAt(i);
            count = 1;
            for (int j = i + 1; j < length; j++) {
                b = str.charAt(j);
                comp = Character.compare(b, a);
                if (comp == 0) {
                    count = count + 1;

                }
            }
            comp = Character.compare(c, a);
            if (count > 1 && comp != 0) {
                System.out.println(a + " repeated " + count + "times");
                c = a;
            }

        }
    }
}
