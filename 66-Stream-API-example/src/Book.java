public class Book {
    private String title;
    private int pageCount;
    private String author;
    private String publishDate;

    public Book(String title, int pageCount, String author, String publishDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publishDate = publishDate;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
