import java.util.Scanner;
public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the first number:");
        int num1= scanner.nextInt();

        System.out.print("Enter the second number:");
        int num2= scanner.nextInt();

        System.out.print("Enter the third number:");
        int num3= scanner.nextInt();

     int max;

     if(num1>num2 && num1>num3){
        max= num1;
     } else if(num2>num3){
        max= num2;
     }else {
        max= num3;
     }

     System.out.println("The maximum of the given three numbers is:"+max);
    }
    
}
