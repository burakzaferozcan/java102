import java.sql.SQLOutput;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İzmir");
        System.out.println(vector);
        vector.add(2,"Bolu");
        System.out.println(vector);
        vector.remove(1);
        System.out.println(vector);
        vector.remove("Ankara");
        System.out.println(vector);
        System.out.println(vector.capacity());
        vector.add("Ankara");
        vector.add("Ankara");
        System.out.println(vector.contains("Ankara"));
        System.out.println(vector);
    }
}
