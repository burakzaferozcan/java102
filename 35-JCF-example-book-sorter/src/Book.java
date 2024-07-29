public class Book implements Comparable<Book> {
    // Kitap sınıfı, Comparable arayüzünü implement eder ve bu sınıfın nesneleri diğer Book nesneleri ile karşılaştırılabilir.

    private String title;
    private int pageCount;
    private String author;
    private int publicationYear;

    public Book(String title, int pageCount, String author, int publicationYear) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // `Comparable` arayüzü tarafından zorunlu kılınan karşılaştırma metodudur.
    @Override
    public int compareTo(Book other) {
        // Bu metod, iki kitap nesnesini başlıklarına göre karşılaştırır.
        // Bu sayede `TreeSet` veya sıralama işlemleri sırasında kitapların sıralanmasını sağlar.
        return this.title.compareTo(other.title);  // Bu kitap nesnesinin başlığını diğer kitap nesnesinin başlığı ile karşılaştırır.
    }
}
