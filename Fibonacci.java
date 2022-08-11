import java.util.*;

public class Fibonacci {
    static HashMap<Integer, Long> dp = new HashMap<>();

    static long getFib(int n) {
        if (dp.containsKey(n))
            return dp.get(n);
        if (n <= 2)
            return 1;
        dp.put(n, getFib(n - 1) + getFib(n - 2));
        return dp.get(n);
    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = getFib(n);
        System.out.println(c);
    }
}
