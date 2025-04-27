class Base {
    private int x;
    private double y;

    protected void setX(int x) {
        this.x = x;
    }

    protected int getX() {
        return x;
    }

    protected void setY(double y) {
        this.y = y;
    }

    protected double getY() {
        return y;
    }
}

class Derived extends Base {
    void printValues() {
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
    }

    void performOperations() {
        setX(10);
        setY(20.5);
        int sum = getX() + (int) getY();
        System.out.println("Sum: " + sum);
        double product = getX() * getY();
        System.out.println("Product: " + product);
    }
}

public class Program14 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.printValues();
        derived.performOperations();
    }
}