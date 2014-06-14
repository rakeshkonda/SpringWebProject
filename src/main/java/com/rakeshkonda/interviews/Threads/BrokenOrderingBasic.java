package classes.Threads;

public class BrokenOrderingBasic implements Runnable {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        BrokenOrderingBasic runnable = new BrokenOrderingBasic();
        Thread thread1 = new Thread(runnable, "thread1");
        Thread thread2 = new Thread(runnable, "thread2");
        thread1.start();
        Thread.sleep(500);
        thread2.start();
    }

    @Override
    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            synchronized (lock1) {
                System.out.println(threadName + " has lock1");
                synchronized (lock2) {
                    System.out.println(threadName + " has lock2");
                    lock1.wait(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}