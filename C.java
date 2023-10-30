abstract class CShape {
    protected String color;
    public abstract void show();
}

class CTriangle extends CShape {
    double sideA;
    double sideB;
    double sideC;

    CTriangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public void setColor(String str) {
        color = str;
    }

    public void show() {
        System.out.print("color=" + color + ", ");
        System.out.println("area=" + 0.5 * sideA * sideB);
    }
}

public class C {
    public static void main(String args[]) {
        CTriangle tri = new CTriangle(3, 4, 5);
        tri.setColor("Red");
        tri.show();
    }
}
