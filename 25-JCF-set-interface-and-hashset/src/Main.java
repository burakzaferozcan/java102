import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
// Set interface Collection interface’den kalıtım almıştır.
// Aynı elemanların veri kümesi içinde tekrar bulunmasına izin vermez


//todo HashSet Sınıfı :
// Liste tipinde veri tutmayı sağlar. Veri kümesindeki elemanlara ekleme, silme ve erişim imkanı tanır.
// Veri kümesinde tekrar eden değer tutmaz.
// Tekrar eden değer tutmamayı nesnelerdeki hashCode fonksiyonunu kullanarak sağlar. “null” değer eklemesi yapılabilir.

        HashSet<Integer> hSet = new HashSet<>();
// veri eklemek için add() metodu kullanılır
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(null);


        for (Integer i : hSet) {
            System.out.println(i);
        }

        // size() metodu verinin  boyutunu  verir
        System.out.println("boyutu : " + hSet.size());
        // clear() verinin içerisindeki tüm verileri temizler
        hSet.clear();
        // isEmpty() içerisinde veri var mı yok mu diye sorgular true false döner
        if (hSet.isEmpty()) {
            System.out.println("değişken boş");
        } else {
            System.out.println("değişken dolu");
        }
        // contains() metodu içerisinde belirtilen veri var mı yok mu diye kontrol eder
        if (hSet.contains(null)) {
            System.out.println("null değer var");
        } else {
            System.out.println("null değer yok");
        }

        hSet.add(null);
        hSet.add(150);
        hSet.add(24);
        if (hSet.contains(150)) {
            System.out.println("içerisinde 150 değeri var");
        } else {
            System.out.println("içerisinde 150 değeri yok");
        }
        // remove() belirli bir değeri siler
        hSet.remove(24);
        System.out.println(hSet);

        // clone() bir HashSet i klonlar
        HashSet<Integer> cloneHSet = (HashSet<Integer>) hSet.clone();
        System.out.println("Orijinal Set: " + hSet);
        System.out.println("Klonlanmış Set: " + cloneHSet);

        hSet.add(1);
        hSet.add(2);
        hSet.add(3);
        hSet.add(4);
        System.out.println(hSet);


        // Iterator kullanarak gezinmek
        System.out.println("iterator kullanarak gezinmek");
        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}

