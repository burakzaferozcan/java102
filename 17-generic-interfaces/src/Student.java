public class Student implements IDatabase<Student>{


    @Override
    public boolean insert(Student data) {
        System.out.println("veri eklendi");
        return true;
    }

    @Override
    public boolean delete(Student data) {
        System.out.println("veri silindi");
        return true;
    }

    @Override
    public boolean update(Student data) {
        System.out.println("veri güncellendi");
        return true;
    }

    @Override
    public Student select() {
        System.out.println("veri çekildi");
        return null;
    }
}
