import java.util.Scanner;
public class Time {

    public int hour;
    public int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
public Time add(Time other) {
        int totalHour = hour + other.hour;
        int totalMinute = minute + other.minute;

        if (totalMinute >= 60) {
            totalHour++;
            totalMinute -= 60;
        }

        return new Time(totalHour, totalMinute);
    }

    public String toString() {
        return String.format("%d:%02d", hour, minute);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first time in 12 hour format (hour:minute): ");
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();

        Time time1 = new Time(hour1, minute1);

        System.out.println("Enter the second time in 12 hour format (hour:minute): ");
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();

        Time time2 = new Time(hour2, minute2);

        Time totalTime = time1.add(time2);

        System.out.println("Original time 1: " + time1);
        System.out.println("Original time 2: " + time2);
        System.out.println("Total time(24 hour format): " + totalTime);
    }
}
