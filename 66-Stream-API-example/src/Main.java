
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Book nesneleri oluşturma
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 150, "Author1", "2020-01-01"));
        books.add(new Book("Book2", 90, "Author2", "2019-05-20"));
        books.add(new Book("Book3", 200, "Author3", "2018-07-15"));
        books.add(new Book("Book4", 85, "Author4", "2021-11-03"));
        books.add(new Book("Book5", 120, "Author5", "2017-03-18"));
        books.add(new Book("Book6", 300, "Author6", "2015-12-25"));
        books.add(new Book("Book7", 55, "Author7", "2022-04-07"));
        books.add(new Book("Book8", 110, "Author8", "2014-09-30"));
        books.add(new Book("Book9", 95, "Author9", "2013-02-12"));
        books.add(new Book("Book10", 130, "Author10", "2023-06-01"));

        // Kitap ismi ve yazar ismi olacak şekilde bir Map oluşturma
        Map<String, String> bookAuthorMap = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor));

        // Sayfa sayısı 100'den fazla olan kitapları filtreleme
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        // Map ve filtrelenmiş kitap listesini yazdırma
        System.out.println("Kitap ve Yazar Map'i: \n" + bookAuthorMap);
        System.out.println("Sayfa sayısı 100'den fazla olan kitaplar:");
        filteredBooks.forEach(book -> System.out.println(book.getTitle() + " - " + book.getPageCount() + " sayfa"));
    }
}
