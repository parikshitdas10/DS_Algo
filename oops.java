
class Pen {
    String color;
    String type; // ball or gel;

    public void write() {
        System.out.println("Writing something...");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";
        pen1.printColor();
        pen2.printColor();
        pen1.write();
    }
}
