import java.util.Scanner;
public class CircleAreaCalculator{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		System.out.print("Enter the radius of circle");
		double radius= scanner.nextDouble();

		double area= 3.414*radius*radius;
		System.out.println("The area of the circle with given radius is"+area);
	}
}