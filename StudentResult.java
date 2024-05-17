import java.util.Scanner;
public class StudentResult{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter the marks in 5 subjects(out of 100)");

        System.out.println("please the the marks of subject 1");
        int a= scanner.nextInt();

        System.out.println("please the the marks of subject 2");
        int b= scanner.nextInt();

        System.out.println("please the the marks of subject 3");
        int c= scanner.nextInt();

        System.out.println("please the the marks of subject 4");
        int d= scanner.nextInt();

        System.out.println("please the the marks of subject 5");
        int e= scanner.nextInt();

        double result= ((a+b+c+d+e)/5);

        if (result>=60) {
        	System.out.println("The resulting student is in first division");
        	
        }
        else if (result>=50 && result<59) {
        	System.out.println("The resulting student is in second division");
        	
        }
        else if (result>=40 && result<49) {
        	System.out.println("The resulting student is in third division");
        	
        }
        else {
        	System.out.println("The resulting student has failed the exam");
        	
        }

	}
}