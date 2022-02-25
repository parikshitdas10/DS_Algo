import java.util.*;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // used to store the number
        int sum = 0; // used to store the sum of digits
        int product = 1; // used to store the product of digits
        System.out.println("Enter a number");
        n = sc.nextInt();
        while (n != 0) {
            sum = sum + n % 10;// adds the last digit of the number in sum
            product = product * n % 10;// multiplies the last digit of number in product
            n = n / 10;// removes the last digit
        }
        if (sum == product) { // checks if sum is equal to product
            System.out.println("Spy number");
        } else {
            System.out.println("Not a spy number");
        }

    }
}
