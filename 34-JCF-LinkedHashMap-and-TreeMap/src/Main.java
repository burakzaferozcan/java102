import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();
        students.put(187 , new Student(187,"Burak"));
        students.put(645 , new Student(645,"Zafer"));
        students.put(88 , new Student(88,"Özcan"));
        students.put(28 , new Student(28,"Şevval"));

        System.out.println(students);

        for (Student student : students.values()) {
            System.out.println(student.getName()+" "+student.getNo());
        }

        System.out.println("-------------");

        TreeMap<Integer, Student> students2 = new TreeMap<>(new OrderByNoComparator().reversed());
        students2.put(187 , new Student(187,"Burak"));
        students2.put(645 , new Student(645,"Zafer"));
        students2.put(88 , new Student(88,"Özcan"));
        students2.put(28 , new Student(28,"Şevval"));

        System.out.println(students2);

        for (Student student : students2.values()) {
            System.out.println(student.getName()+" "+student.getNo());
        }
    }
}
