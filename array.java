import java.util.*;

public class array {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        arr.add(20);
        arr.add(30);
        arr.add(10);
        arr.add(61);
        arr.add(1);
        arr.remove(1);
        arr.set(0, 100);
        int n = arr.size();

        List<String> str = new ArrayList();
        str.add("India");
        str.add("Pakistan");
        str.add("Afghanistan");
        str.add("China");
        str.add("Bangladesh");
        str.set(2, "Taliban");
        Collections.sort(str);
        System.out.println(str);

    }
}
