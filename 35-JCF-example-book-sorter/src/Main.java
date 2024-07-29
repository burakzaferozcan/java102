import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Kürk Mantolu Madonna", 216, "Sabahattin Ali", 1943);
        Book book2 = new Book("Sefiller", 1232, "Victor Hugo", 1862);
        Book book3 = new Book("Suç ve Ceza", 430, "Fyodor Dostoyevski", 1866);
        Book book4 = new Book("Yüzyıllık Yalnızlık", 417, "Gabriel García Márquez", 1967);
        Book book5 = new Book("Benim Adım Kırmızı", 248, "Orhan Pamuk", 1998);

        // Kitapları isimlerine göre sıralamak için TreeSet kullanıyoruz
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);

        System.out.println("Kitapları isme göre sıralama :");
        for (Book book : bookSetByName) {
            System.out.println(book.getTitle() + ": " + book.getPageCount() + " sayfa");
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        // Kitapları sayfa sayılarına göre sıralamak için özel bir Comparator kullanıyoruz
        Set<Book> bookSetByPageCount = new TreeSet<>(new PageCountComparator());
        bookSetByPageCount.add(book1);
        bookSetByPageCount.add(book2);
        bookSetByPageCount.add(book3);
        bookSetByPageCount.add(book4);
        bookSetByPageCount.add(book5);

        System.out.println("Kitapları sayfa sayısına göre sıralama:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book.getTitle() + ": " + book.getPageCount() + " sayfa");
        }
    }
}
