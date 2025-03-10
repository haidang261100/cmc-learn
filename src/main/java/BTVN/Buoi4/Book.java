package BTVN.Buoi4;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }


    public void displayDetail() {
        System.out.println("Chi tiết sách");
        System.out.println("Mã sách: " + isbn);
        System.out.println("Tiêu đề : " + title);
        System.out.println("Tác giả : " + author);
        if (isAvailable) {
            System.out.println("Tình trạng: Có sẵn");
        } else {
            System.out.println("Tình trạng: Đã mượn");
        }
    }

    public void checkAvailable(String isbn) {
        if (isAvailable) {
            System.out.println("Sách còn trong thư viện");
        } else
            System.out.println("Sách đã cho mượn, không còn trong thư viện");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
