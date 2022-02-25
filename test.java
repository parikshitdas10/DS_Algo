import java.io.*;

class Pen {
    String color;
    String type; // ball or gel;

    public void write() {
        System.out.println("Writing something...");
    }
}

public class test {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
    }
}
