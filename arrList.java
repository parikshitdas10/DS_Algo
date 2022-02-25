import java.util.*;

public class arrList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        System.out.println(fruits);
        System.out.println(fruits.get(3));
        // use set(index, value) to replace
        fruits.set(2, "Grape");
        System.out.println(fruits);
    }
}