import java.util.*;

public class FactorAndFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch; // used to store the user choice
        int n; // used to store the used input number
        int i; // used for loop operation
        int factorial = 1; // used to store the factorial of number
        System.out.println("Enter '1' for factor and '2' for factorial: ");
        ch = sc.nextInt();
        System.out.println("Enter number: ");
        n = sc.nextInt();
        switch (ch) {
            case 1:
                for (i = 1; i < n; i++) {
                    if (n % i == 0) { // a multiple should be able to completely divide the number
                        System.out.print(i + ",");
                    }
                }
                break;
            case 2:
                for (i = 1; i <= n; i++) {
                    factorial = factorial * i;
                }
                System.out.println(factorial);
                break;
            default:
                System.out.println("Error! Incorrect Choice");
        }
    }
}
