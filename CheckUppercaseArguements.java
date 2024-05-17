import java.util.Scanner;

public class CheckUppercaseArguements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter command-line arguments (separated by spaces):");
        String argumentsLine = scanner.nextLine();

        Scanner argumentScanner = new Scanner(argumentsLine);

        while (argumentScanner.hasNext()) {
            String arg = argumentScanner.next();
            char firstChar = arg.charAt(0);

            if (firstChar < 'A' || firstChar > 'Z') {
                System.out.println("Error: Argument '" + arg + "' does not begin with an uppercase letter.");
                System.exit(1); // Terminate with an error code
            }
        }

        System.out.println("All arguments begin with uppercase letters.");
    }
}