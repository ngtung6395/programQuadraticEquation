import java.util.Scanner;

public class QuadraticEquation {
    float a;
    float b;
    float c;

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getDelta() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public float getX1() {
        return (float) ((-this.b + Math.sqrt(this.getDelta())) / (2*a));
    }

    public float getX2() {
        return (float) ((-this.b - Math.sqrt(this.getDelta())) / (2*a));
    }

    public boolean checkDelta() {
        if (this.getDelta() >= 0) {
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Nhập hệ số của phương trình");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        QuadraticEquation pt1 = new QuadraticEquation(a,b,c);
        if(pt1.checkDelta())
            System.out.println("Phương trình có 2 nghiệm x1 ="+ pt1.getX1() + " x2 =" +pt1.getX2());
        else
            System.out.println("Phương trình vô nghiệm");
    }
}
