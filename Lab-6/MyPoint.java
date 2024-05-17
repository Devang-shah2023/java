import java.util.Scanner;

public class MyPoint{
    private double x;
    private double y;

    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(double x, double y){
        this.x=x;
        this.y=y;

    }
    public double getX(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }

    public double distance(MyPoint otherPoint){
        double xDiff= this.x-otherPoint.x;
        double yDiff= this.y-otherPoint.y;

        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public static MyPoint createPoint(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter x-coordinate:");
        double x= scanner.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y= scanner.nextDouble();

        return new MyPoint(x,y);
    }
    public static void main(String[] args){
        MyPoint point1= new MyPoint();
        MyPoint point2= new MyPoint(3,4);

        System.out.println("point 1: ("+point1.getX()+ ","+point1.gety()+")");
        System.out.println("point 2: ("+point2.getX()+ ","+point2.gety()+")");

        double distance= point1.distance(point2);
        System.out.println("Distance between point1 and point2:"+distance);

        MyPoint point3= MyPoint.createPoint();
        System.out.println("Point 3: ("+point3.getX()+","+point3.gety()+ ")");

        distance= point1.distance(point3);
        System.out.println("Distance between point1 and point3"+distance);
    }
}