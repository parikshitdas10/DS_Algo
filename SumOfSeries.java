import java.util.*;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x; // stores input from user
        int n; // stores the limit
        double sum = 1.0;// stores the sum of series
        int i; // used for loop operation
        int j; // used for loop operation
        int factorial; // used for storing factorial;
        System.out.println("Enter 'x': ");
        x = sc.nextInt();
        System.out.println("Enter 'n': ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            factorial = 1;
            for (j = 1; j <= i; j++) {
                factorial = factorial * j; // to calculate the factorial of denominator
            }
            sum = sum + Math.pow(x, i) / factorial; // calculates the sum of series
        }
        System.out.println("The sum of series is: " + sum);
    }
}
