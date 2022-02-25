import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks % of English Maths and Science respectively");
        double eng = sc.nextDouble();
        double mat = sc.nextDouble();
        double sci = sc.nextDouble();
        if (eng >= 90 && sci >= 90) {
            if (mat >= 90) {
                System.out.println("Computer Science");
            } else if (mat >= 70) {
                System.out.println("Economic Application");
            }
        } else if (eng >= 70 && sci >= 70) {
            if (mat >= 70) {
                System.out.println("Arts");
            } else {
                System.out.println("No stream possible");
            }
        } else {
            System.out.println("No stream possible");
        }
    }
}
