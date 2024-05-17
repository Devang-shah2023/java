import java.util.Scanner;
public class CircleClassArea {

    // public static double getArea(double radius) {
    //     return Math.PI * radius * radius;
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle c1= new Circle();

        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();

        double area = c1.area();
        System.out.println("The area of the circle is: " + area);
    }
}

class Circle{
    double r;

    public double area(){
        return (Math.PI*r*r);
    }
}
