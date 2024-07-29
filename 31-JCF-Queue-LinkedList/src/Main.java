import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        Queue<String> q = new LinkedList<>();


        // add(eleman): Parametrede verilen elemanı kuyruğa ekler. İşlemin başarısız olması durumunda hata fırlatır.
        q.add("Burak");
        q.add("Zafer");
        // offer(eleman): Parametrede verilen elemanı kuyruğa ekler. İşlemin başarısız olması durumunda null döner.
        q.offer("Özcan");


        Iterator<String> it = q.iterator();
//todo        FIFO
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------");
        // remove(); değer verilmezse Kuyruğun başındaki elemanı siler değer verilirse verilen elemanı kuyruktan çıkarır
        q.remove();
        it = q.iterator();

        //todo        FIFO
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("-----------------");

        // element() : Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz.
        System.out.println(q.element());
        System.out.println(q);
        System.out.println("-----------------");


        // peek(): Kuyrukta sıradaki elemana ulaşmak için kullanılır.
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println("-----------------");


        // poll(): Kuyruğun başındaki elemanı kuyruktan çıkartır.
        q.poll();
        System.out.println(q);
        System.out.println("-----------------");
    }
}
