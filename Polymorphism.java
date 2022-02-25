public class Polymorphism {
    public static void main(String[] args) {// many functions with same name
        Student s1 = new Student();
        s1.printInfo("parikshit");
        s1.printInfo(20);
        s1.printInfo("parikshit das", 19);
    }
}

class Student {
    String name;
    int age;

    static void printInfo(String name) {
        System.out.println(name);
    }

    static void printInfo(int age) {
        System.out.println(age);
    }

    static void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

}