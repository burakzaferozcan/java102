import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1'den 10000'e kadar olan sayılardan oluşan bir ArrayList oluştur
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        // Sayıları 4 parçaya böl
        List<Integer> part1 = numbers.subList(0, 2500);
        List<Integer> part2 = numbers.subList(2500, 5000);
        List<Integer> part3 = numbers.subList(5000, 7500);
        List<Integer> part4 = numbers.subList(7500, 10000);

        // Tek ve çift sayıları saklamak için ortak ArrayList'ler
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // 4 Thread oluştur
        Thread t1 = new NumberProcessor(part1, evenNumbers, oddNumbers);
        Thread t2 = new NumberProcessor(part2, evenNumbers, oddNumbers);
        Thread t3 = new NumberProcessor(part3, evenNumbers, oddNumbers);
        Thread t4 = new NumberProcessor(part4, evenNumbers, oddNumbers);

        // Thread'leri başlat
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Tüm Thread'lerin bitmesini bekle
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sonuçları konsola yazdır
        System.out.println("Çift Sayılar: " + evenNumbers);
        System.out.println("Tek Sayılar: " + oddNumbers);
    }
}
