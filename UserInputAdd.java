import java.util.Scanner;

public class UserInputAdd{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		double a= scanner.nextDouble();

		System.out.println("Enter the second number:");
		double b= scanner.nextDouble();

		double sum=a+b;
		System.out.println("Sum of a and b is:"+sum);
	}
}