import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        pq1.add("Burak");
        pq1.add("Zafer");
        pq1.add("Ahmet");
        pq1.add("Pelin");


        for (String s : pq1) {
            System.out.println(s);
        }

        System.out.println("-----------------");


        PriorityQueue<String> pq2 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());
        pq2.add("Burak");
        pq2.add("Zafer");
        pq2.add("Ahmet");
        pq2.add("Pelin");

        for (String s : pq2) {
            System.out.println(s);
        }
    }
}
