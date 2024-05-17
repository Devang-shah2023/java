import java.util.Scanner;
public class UserInputCommandAdd {
    public static void main(String[] args) {
        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        
        System.out.println(a + b);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double c= scanner.nextDouble();

        System.out.println("Enter the second number:");
        double d= scanner.nextDouble();

        double sum=c+d;
        System.out.println("Sum of a and b is:"+sum);
    
    }
}