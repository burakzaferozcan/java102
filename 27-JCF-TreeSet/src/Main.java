import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // TreeSet Sınıfı Veri kümesine konulan elemanların verdiğiniz kurala göre sıralanmasını sağlar.

        OrderNoteComparator orderNote=new OrderNoteComparator();
        TreeSet<Student> students = new TreeSet<>(orderNote);
        students.add(new Student("Burak",50));
        students.add(new Student("Mahmut",60));
        students.add(new Student("Zafer",100));
        students.add(new Student("Özcan",75));
        students.add(new Student("Mustafa",15));

        System.out.println(students.size());
        for(Student student:students){
            System.out.println(student.getName());
        }
        System.out.println("------------------");
        TreeSet<Student> students2 = new TreeSet<>(orderNote.reversed());
        students2.add(new Student("Burak",50));
        students2.add(new Student("Mahmut",60));
        students2.add(new Student("Zafer",100));
        students2.add(new Student("Özcan",75));
        students2.add(new Student("Mustafa",15));

        for(Student student:students2){
            System.out.println(student.getName());
        }

        System.out.println("------------------");

        TreeSet<Student> students3 = new TreeSet<>(new OrderNameComparator());
        students3.add(new Student("Burak",60));
        students3.add(new Student("Deniz",75));
        students3.add(new Student("Ferdi",15));
        students3.add(new Student("Ahmet",50));
        students3.add(new Student("Can",100));
        for(Student student:students3){
            System.out.println(student.getName());
        }
        System.out.println("------------------");

        TreeSet<Student> students4= new TreeSet<>(new OrderNameComparator().reversed());
        students4.add(new Student("Burak",60));
        students4.add(new Student("Deniz",75));
        students4.add(new Student("Ferdi",15));
        students4.add(new Student("Ahmet",50));
        students4.add(new Student("Can",100));

        for(Student student:students4){
            System.out.println(student.getName());
        }
    }
}
