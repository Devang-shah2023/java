public class Lab91 {
    public static void main(String[] args) {
        GreetingThread morningGreeting = new GreetingThread("Good Morning", 1000);
        GreetingThread afternoonGreeting = new GreetingThread("Good Afternoon", 3000);

        Thread morningThread = new Thread(morningGreeting);
        Thread afternoonThread = new Thread(afternoonGreeting);

        morningThread.start();
        afternoonThread.start();
    }
}

class GreetingThread implements Runnable {
    String message;
    int interval;

    GreetingThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
