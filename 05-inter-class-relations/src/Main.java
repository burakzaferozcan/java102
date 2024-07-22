public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("burak", "özcan", "123", "kocaeli", 100);
        Student st2 = new Student("zafer", "özcan", "124", "kocaeli", 75);
        Student st3 = new Student("özcan", "özcan", "125", "kocaeli", 50);
        Instructor teacher1 = new Instructor("Mahmut", "Osman", "CENG");

//        Course has a Instructor Composition-Birleştirme (SInıfın bir öğretmeni vardir.)
        Course mat = new Course("mat101", "MAT", teacher1);
        Student[] students = {st1, st2, st3};
        System.out.println("Ortalama : " + mat.calcAvarage(students));
        System.out.println(mat.getInstructor().getName());


    }
}
