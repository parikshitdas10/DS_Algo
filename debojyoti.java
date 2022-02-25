
import java.util.*;

public class debojyoti {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int i, marks, roll;
        String name, dept;
        student[] arr;
        arr = new student[5];
        for (i = 0; i < 5; i++) {
            System.out.print("Enter the Student's name, roll no, marks and dept respectively ::: ");
            name = sc.next();
            roll = sc.nextInt();
            marks = sc.nextInt();
            dept = sc.next();

            arr[i] = new student(name, dept, marks, roll);
        }
        ArrayList<String> name_highest = student.highest(arr);
        ArrayList<String> name_lowest = student.lowest(arr);
        ArrayList<String> name_average = student.average(arr);
        Iterator<String> ith = name_highest.iterator();
        Iterator<String> itl = name_lowest.iterator();
        Iterator<String> itav = name_average.iterator();
        System.out.print("The Students with Maximum marks are as follows ::: ");
        while (ith.hasNext())
            System.out.println(ith.next());
        System.out.println();
        System.out.print("The Students with Lowest marks are as follows ::: ");
        while (ith.hasNext())
            System.out.println(itl.next());
        System.out.println();
        System.out.print("The Students with More than Average marks are as follows ::: ");
        while (ith.hasNext())
            System.out.println(itav.next());

    }
}

class student {
    private int marks;
    private String name;
    private String dept;
    private int roll;

    student(String name, String dept, int marks, int roll) {
        this.marks = marks;
        this.dept = dept;
        this.name = name;
        this.roll = roll;
    }

    int return_marks() {
        return marks;
    }

    String return_name() {
        return name;
    }

    static ArrayList<String> highest(student arr[]) {
        ArrayList<String> arstr = new ArrayList<String>();

        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i].return_marks() > max)
                max = arr[i].return_marks();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i].return_marks() == max)
                arstr.add(arr[i].return_name());
        }
        return arstr;
    }

    static ArrayList<String> lowest(student arr[]) {
        ArrayList<String> arstr = new ArrayList<String>();

        int min = 9999;
        for (int i = 0; i < 5; i++) {
            if (arr[i].return_marks() < min)
                min = arr[i].return_marks();

        }
        for (int i = 0; i < 5; i++) {
            if (arr[i].return_marks() == min)
                arstr.add(arr[i].return_name());
        }
        return arstr;
    }

    static ArrayList<String> average(student arr[]) {
        ArrayList<String> arstr = new ArrayList<String>();
        double avg = 0;
        for (int i = 0; i < 5; i++)
            avg = avg + arr[i].return_marks();
        avg = avg / 5;
        for (int i = 0; i < 5; i++) {
            if (arr[i].return_marks() >= avg)
                arstr.add(arr[i].return_name());
        }

        return arstr;
    }
}
