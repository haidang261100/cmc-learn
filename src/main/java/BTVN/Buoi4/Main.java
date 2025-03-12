package BTVN.Buoi4;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("B1", "Sách 1", "Đăng", true));
        library.addBook(new Book("B2", "Sách 2", "Đăng", true));
        library.addBook(new Book("B3", "Sách 3", "Đăng", false));

//        library.listBooks();
//        library.searchBookByTitle("Sách 1");
        library.borrowBook("Sách 1");
        library.returnBook("Sách 1");

        library.borrowBook("Sách 3");
        library.returnBook("Sách 2");


        library.borrowBook("Sách 4");
        library.returnBook("Sách 4");

//        library.removeBook("B3");


    }

}
