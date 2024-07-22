public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordofTheRings = new Book("Lord of The Rings", -100);
        System.out.println(lordofTheRings.getPageNumber());
        lordofTheRings.setPageNumber(-100);
        System.out.println(lordofTheRings.getPageNumber());
        System.out.println(lordofTheRings.getName());

    }
}
