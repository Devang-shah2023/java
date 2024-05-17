import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter the first number:");
		double num1= scanner.nextDouble();

		System.out.println("Enter the second number:");
		double num2= scanner.nextDouble();

		System.out.println("Enter the operation(+,-,*,/):");
		String operation = scanner.next();

		double result;

		switch(operation){
		case "+":
			result= num1+num2;
			break;

		case "-":
			result= num1-num2;
		    break;

		case "*":
			result= num1*num2;
		    break;

		case "/":
			if(num2 !=0){
			result= num1/num2;
		    } else{
		    	System.out.println("Error: Cannot divide by zero.");
                return;
		    }
		    break;
		default:
			System.out.println("Error: Invalid operation. Please choose the operation given above");
			return;
		}
		System.out.println("Result:" + result);
	}
}