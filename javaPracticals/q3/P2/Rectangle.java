package P2;
import P1.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double x, y;

    public void readTheData(){
        System.out.println("enter lenghts of 2 sides : ");
        Scanner sc = new Scanner(System.in);
        setX(sc.nextDouble());
        setY(sc.nextDouble());
        setArea(getX()*getY());
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
