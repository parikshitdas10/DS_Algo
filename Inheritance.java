public class Inheritance {
    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.color = "red";
        T1.area();
    }
}

class Shape {
    static void area() {
        System.out.println("Displaying area..");
    }
}

class Triangle extends Shape {
    String color;
}
