import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        OrderMatic oMatic = new OrderMatic();
        List<Thread> islemler = new ArrayList<>();

        ExecutorService pool= Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            pool.execute(oMatic);
        }
        System.out.println(oMatic.getOrderNo());
    }
}
