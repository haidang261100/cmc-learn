package BTVN.Buoi4;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("B1", "Cuộc đời", "Đăng", true));
        library.addBook(new Book("B2", "Trò chơi", "Đăng 1", true));
        library.addBook(new Book("B3", "Cuộc sống", "Đăng 2", false));

        library.listBooks();


    }

}
