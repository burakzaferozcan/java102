import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("first");
        list.add("Burak");
        list.add("Zafer");
        list.addLast("last");
        list.add("Özcan");
        list.add("Java");
        list.add("102");




        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
