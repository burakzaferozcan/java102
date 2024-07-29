import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // first in first out
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(888);
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(null);
        System.out.println(list);
        System.out.println("-------------");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------");
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("-------------");

        System.out.println(list.size());
        System.out.println(list2.size());
        System.out.println("-------------");


        // get() metodu index nuamrasına göre elemanı getirir
        System.out.println(list.get(0));

        System.out.println("-------------");
        // indexOf() metodu istenilen elemanın ilk karşılaşıldığı index numarasını getirir
        System.out.println(list.indexOf(null));
        System.out.println("-------------");

        // lastIndexOf() metodu istenilen elemanın son karşılaşıldığı index numarasını getirir
        System.out.println(list.lastIndexOf(null));
        System.out.println("-------------");

        // override edilmiş add() metodu belirtilen indexe yeni bir eleman ekler (değiştirmez ekler)
        list.add(1, 98235);
        System.out.println(list);
        System.out.println("-------------");

        // set() metodu belirtilen indexteki elemanı değiştirir
        list.set(0, 555);
        System.out.println(list);
        System.out.println("-------------");

        // contains(x) belirtilen eleman listede var mı yok mu kontrol eder true/false döner
        System.out.println(list.contains(10));
        System.out.println("-------------");

        // remove() metodu belirtilen indexteki elemanı siler
        list.remove(5);
        System.out.println(list);
        System.out.println("-------------");

        // addAll() bir listeyi tümüyle diğer listenin üzerine eklemek için kullanılır
        System.out.println(list2);
        list2.addAll(list);
        System.out.println(list2);
        System.out.println("-------------");

        // subList() metodu listeden alt bir liste oluşturur başlangıç bitiş indisleri verilir
        List<Integer> list3 = list.subList(0, 3);
        System.out.println("list1 : " + list + "\n" +
                "list3 : " + list3);
        System.out.println("-------------");

        // clear() metodu listeyi temizler
        System.out.println("clear öncesi list : " + list );
        list.clear();
        System.out.println("clear sonrası list : " + list );


    }
}
