import java.util.Scanner;

public class ComplexNumber {

    public double real;
    public double imaginary;

    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static ComplexNumber getInputFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of the complex number: ");
        double real = scanner.nextDouble();

        System.out.print("Enter imaginary part of the complex number: ");
        double imaginary = scanner.nextDouble();

        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }

    public static void main(String[] args) {
        System.out.println("** Complex Number Addition **");

        ComplexNumber num1 = getInputFromUser();
        ComplexNumber num2 = getInputFromUser();

        ComplexNumber sum = num1.add(num2);

        System.out.println("The sum of the two complex numbers is: " + sum);
    }
}
