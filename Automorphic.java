import java.util.*;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // stores the user input
        int sq; // stores the square of number
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        sq = n * n;
        while (n != 0) {
            if (n % 10 != sq % 10) { // checks if the last digits are same
                System.out.println("Not automorphic");
                return;
            }
            n = n / 10;
            sq = sq / 10;// removes the last digits
        }
        System.out.println("Automorphic number");
    }
}
