package P1;
import java.util.Scanner;

public abstract class Shape {
    private double area;
    public void dispatch() {
        System.out.println("shape :: " + this.getClass().getSimpleName());
        System.out.println("area :: " + this.getArea());
    }
    public double getArea(){return area;}

    public void setArea(double area) {this.area = area;}

    public void readTheData(){}
}
