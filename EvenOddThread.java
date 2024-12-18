package tasks;

public class EvenOddThread extends Thread {
    private final String type; 
    private static final Object lock = new Object();
    private static int number = 1; 

    public EvenOddThread(String name, String type) {
        super(name);
        this.type = type;
    }

    
    public void run() {
        while (number <= 10) {
            synchronized (lock) {
                if ((type.equals("Odd") && number % 2 != 0) || (type.equals("Even") && number % 2 == 0)) {
                    System.out.println(getName() + " (" + type + "): " + number);
                    number++;
                    lock.notify(); 
                } else {
                    try {
                        lock.wait(); 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        EvenOddThread oddThread = new EvenOddThread("Odd", "Odd");
        EvenOddThread evenThread = new EvenOddThread("Even", "Even");

        oddThread.start();
        evenThread.start();
    }
}
