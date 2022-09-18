import com.sun.tools.jconsole.JConsoleContext;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("------------------------");

        Point point = new Point(3,5);
        Circle circle = new Circle(5,5,8);
        Cylinder cylinder = new Cylinder(4,1,4,3);

        double circleS = 3.14 * Math.pow(circle.getR(),2);
        double circleCV = 4 * 3.14 * circle.getR();

        double cylinderCV = 3.14 * Math.pow(cylinder.getR(),2);
        double cylinderP = 3.14 * Math.pow(cylinder.getR(),2)*cylinder.getH();

        System.out.println("Point: ("+point.getX() +"," +point.getY() + ")");
        System.out.println("Circle : (" + circle.getX() +"," +circle.getY() + ") ,R = " + circle.getR() + " ,CV = " + circleCV + " ,S = " + circleS);
        System.out.println("Cylinder : (" + cylinder.getX() +"," +cylinder.getY() + ") ,R = " + cylinder.getR() + " ,H = " + cylinder.getH() + " ,CV = " + cylinderCV+ " ,P = " + cylinderP);
    }
}

