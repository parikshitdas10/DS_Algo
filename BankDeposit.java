import java.util.*;

public class BankDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P; // to store the principle or monthly installment
        double r; // to store the rate of interest
        int n; // to store the time period in months or years
        double A; // to store the maturity amount
        int ch; // to store the user choice
        System.out.println("Enter 1 for Term deposit and 2 for Recurring Deposit: ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter Principle P: ");
                P = sc.nextInt();
                System.out.println("Enter rate of interest r: ");
                r = sc.nextDouble();
                System.out.println("Enter time period 'n' in years: ");
                n = sc.nextInt();
                A = P * Math.pow(1 + r / 100, n); // formula to calculate maturity amount
                System.out.println("Maturity Amount: " + A);
                break;
            case 2:
                System.out.println("Enter monthly installment P: ");
                P = sc.nextInt();
                System.out.println("Enter rate of interest r: ");
                r = sc.nextDouble();
                System.out.println("Enter time period 'n' in months: ");
                n = sc.nextInt();
                A = P * n + P * (n * (n + 1) / 2) * (r / 100) * (1 / 12);// formula to calculate maturity amount
                System.out.println("Maturity amount: " + A);
                break;
            default:
                System.out.println("Error! Invalid choice");
        }
    }
}
