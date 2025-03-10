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


    public void removeBook(String isbn){
        for (int i = 0; i <= bookCount; i++){
            if (books[i].equals(isbn)){

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
}
