import bank;
import java.util.*;

public class Package {
    public static void main(String[] args) {
        bank.Account customer1 = new bank.Account();
        customer1.name = "abc";
        System.out.println(customer1.name);
    }
}
