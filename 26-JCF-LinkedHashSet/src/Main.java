import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        //todo LinkedHashSet sıralama garantisi veren bir HashSet sürümüdür HashSet'in tüm özelliğini barındırır.
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(15);
        linkedHashSet.add(86);
        linkedHashSet.add(1);
        linkedHashSet.add(0);
        linkedHashSet.add(3);
        linkedHashSet.add(15);

        System.out.println(linkedHashSet);
        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*******************************");



    }
}
