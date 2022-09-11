import P1.Shape;
import P2.Rectangle;
import P3.Circle;

import java.util.Scanner;

public class Main3 {
    public static void main(String []args){
        System.out.println("Rectangle or circle / R : C");
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        Shape sh = null ;
        if(inp.equals("R")){
            sh = new Rectangle();
        }
        else if(inp.equals("C")){
            sh = new Circle();
        }
        sh.readTheData();
        sh.dispatch();
    }
}
