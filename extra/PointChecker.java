package extra;
import java.util.Scanner;

public class PointChecker {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter the side-1 of triangle in x1 & y1");
        double x1= scanner.nextDouble();
        double y1= scanner.nextDouble();

        System.out.println("Please enter the side-2 of triangle in x2 & y2");
        double x2= scanner.nextDouble();
        double y2= scanner.nextDouble();

        System.out.println("Please enter the side-3 of triangle in x3 & y3");
        double x3= scanner.nextDouble();
        double y3= scanner.nextDouble();
        
        System.out.println("Please enter the coordinates of point to find in triangle");
        double p1= scanner.nextDouble();
        double p2= scanner.nextDouble();

        double ABC=(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0;
        double PAB=(p1*(y1-y2)+x1*(y2-p2)+x2*(p2-y1))/2.0;
        double PBC=(p1*(y2-y3)+x2*(y3-p2)+x3*(p2-y2))/2.0;
        double PAC=(p1*(y1-y3)+x1*(y3-p2)+x3*(p2-y1))/2.0;

        double area= PAB+PBC+PAC;

        System.out.println(area+" "+ABC);

        if(area==ABC){

            System.out.println("The given point lies inside the given area of triangle");
        }
        else{
            System.out.println("The given point is outside the triangle");
        }
                   
        
    }
    
}
