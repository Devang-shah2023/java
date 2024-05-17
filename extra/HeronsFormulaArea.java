package extra;
import java.util.Scanner;

 public class HeronsFormulaArea {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter side of triangle s1");
        double s1= scanner.nextDouble();

        System.out.println("Please enter side of triangle s2");
        double s2= scanner.nextDouble();

        System.out.println("Please enter side of triangle s3");
        double s3= scanner.nextDouble();

        double S= (s1+s2+s3)/2.0;
        double area=Math.sqrt(S*(S-s1)*(S-s2)*(S-s3));

        System.out.println("Area of triangle ="+area);
    }

    
}
