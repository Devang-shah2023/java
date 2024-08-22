public class Lab91alter {
    public static void main(String[] args) {
        GreetingThread morningGreeting = new GreetingThread("1", 1000);
        GreetingThread afternoonGreeting = new GreetingThread("2", 1000);
        GreetingThread eveningGreeting = new GreetingThread("3", 1000);
        GreetingThread nightGreeting = new GreetingThread("4", 1000);

        Thread morningThread = new Thread(morningGreeting);
        Thread afternoonThread = new Thread(afternoonGreeting);
        Thread eveningThread = new Thread(eveningGreeting);
        Thread nightThread = new Thread(nightGreeting);

        morningThread.start();
        afternoonThread.start();
        eveningThread.start();
        nightThread.start();
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
