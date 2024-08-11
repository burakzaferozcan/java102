import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);
        list.add(63);
        list.add(63);
        list.add(63);

        //todo forEach()
        list.stream().forEach(System.out::println);
        System.out.println("------------------------");
        list.forEach(i->System.out.print(i+" "));
        System.out.println("\n------------------------");

        //todo filter() : istediğimiz gibi filtrelememize yarar
        list.stream().filter(num->num>60).forEach(i->System.out.print(i+" "));
        System.out.println("\n------------------------");

        //todo distinct() : tekrar eden eleman varsa sadece 1 tanesini alır
        list.stream().distinct().forEach(i->System.out.print(i+" "));
        System.out.println("\n------------------------");

        //todo sorted() : sıralama yapmaya yarar
        list.stream().distinct().sorted().forEach(i->System.out.print(i+" "));
        System.out.println();
        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
        System.out.println("\n------------------------");

        //todo limit() : işlemleri belli bir sayıyla sınırlandırabiliriz
        list.stream().limit(2).forEach(i->System.out.print(i+" "));
        System.out.println("\n------------------------");

        //todo skip() : bu metodla akışın belli sayıda elemanını atlayabiliriz
        list.stream().skip(5).forEach(i->System.out.print(i+" "));
        System.out.println("\n------------------------");

        //todo count() : bu metodla akuştaki eleman sayısını öğrenebiliriz
        System.out.print(list.stream().count());
        System.out.println("\n------------------------");

        //todo anyMatch() : Predicate türünde bir parametre alır ve bu testi akışın bütün elemanları üzerinde uygular.
        //todo Elemanlardan herhangi biri bu testten geçiyorsa true aksi halde false döner
        boolean control=list.stream().anyMatch(i->i==25);
        System.out.print(control);
        System.out.println("\n------------------------");

        //todo allMatch() : Predicate türünde bir parametre alır ve bu testi akışın bütün elemanları üzerinde uygular.
        //todo Elemanların tamamı bu testten geçiyorsa true, aksi halde false döndürür.
        boolean match = list.stream().allMatch(number -> number < 500);
        System.out.print(match);
        System.out.println("\n------------------------");

        //todo noneMatch() : Predicate türünde bir parametre alır ve bu testi akışın bütün elemanları üzerinde uygular.
        //todo Elemanların hiçbiri bu testten geçmiyorsa true, aksi halde false döndürür.
        boolean match2 = list.stream().noneMatch(number -> number > 500);
        System.out.print(match2);
        System.out.println("\n------------------------");

        //todo map() : Akışın elemanlarını değiştirmek için bu metodu kullanabilirsiniz. Function<T,R>
        //todo türünde bir parametre alır ve bu fonksiyonu akışın bütün elemanlarına uygular.
        //todo Akışın yeni elemanları bu metottan dönen değerlerdir.
        list.stream().map(i->i*2).forEach(i-> System.out.print(i+" "));


    }
}
