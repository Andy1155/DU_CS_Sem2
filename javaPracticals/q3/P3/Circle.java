package P3;
import P1.Shape;
import java.util.Scanner;
public class Circle extends Shape {
    private double r;
    private final double pi = 3.14;
    public void readTheData(){
        System.out.println("enter radius : ");
        Scanner sc = new Scanner(System.in);
        setR(sc.nextDouble());
        setArea(pi*getR()*getR());
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
}
