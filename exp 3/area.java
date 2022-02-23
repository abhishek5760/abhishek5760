import java.util.*;
public class area {
    public static void main(String[] args) {
        shape obj = new shape();

        obj.circlearea(4);
        obj.area(5, 3);
        obj.triangleArea(4, 7);
    }
}

class shape {
    void area(double length, double height) {
        double area = length * height;

        System.out.println("The area of the rectangle is: " + area);
    }

    void circlearea(double radius) {
        double area = 3.14 * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }

    void triangleArea(double length, double height) {
        double area = 0.5 * length * height;

        System.out.println("The area of the trangle is: " + area);
    }
}
