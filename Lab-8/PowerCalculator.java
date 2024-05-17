public class PowerCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter two  while running the code");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int result = computePower(x, y);
            System.out.println(x + " raised to the power of " + y + " is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please provide integer values for x and y.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input! x must be non-negative.");
        }
    }

    public static int computePower(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be non-negative");
        }

        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
