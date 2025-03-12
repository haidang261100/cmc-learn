package BTVN.Buoi4;

public class Library {

    private Book[] books = new Book[10];
    private int bookCount = 0;

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Thư viện đã đầy!");
        }
    }


    public void removeBook(String isbn) {
        for (int i = 0; i <= bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                System.out.println("Đã xóa sách có mã: " + isbn);
                break;
            } else
                System.out.println("Không có sách này trong thư viện");
        }
    }

    public void listBooks() {
        if (bookCount == 0) {
            System.out.println("Không có sách nào trong thư viện.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }


    public Book searchBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
//                System.out.println(books[i]);
                return books[i];
            }
        }
//        System.out.println("Không tìm thấy sách với title = " + title);
        return null;
    }


    public void borrowBook(String title) {
        Book book = searchBookByTitle(title);
        if (book != null) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Sách có tên : " + title + " đã cho mượn thành công");
            } else
                System.out.println("Sách có tên : " + title + " đã hết ");
        } else
            System.out.println("Không tìm thấy sách với tên: " + title);

    }

    public void returnBook(String title) {
        Book book = searchBookByTitle(title);
        if (book != null) {
            if (!book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Sách có tên : " + title + " trả thành công");
            } else
                System.out.println("Sách có tên : " + title + " đã có trong thư viện");
        } else
            System.out.println("Không tìm thấy sách với tên: " + title);

    }
}
