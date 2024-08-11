import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderMatic oMatic = new OrderMatic();
        Thread t1 = new Thread(oMatic);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread t2 = new Thread(oMatic);
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<Thread> islemler = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(oMatic);
            islemler.add(t);
            t.start();
        }
        for (Thread t : islemler) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(oMatic.getOrderNo());
    }
}
