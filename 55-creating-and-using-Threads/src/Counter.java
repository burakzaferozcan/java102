public class Counter extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
