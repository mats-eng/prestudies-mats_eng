package udemyExcercises.libraryApp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository() {
        books.add(new Book("83471", "The Dead of Night", "Horror", null, "S.K.Eleton", 10, 7));
        books.add(new Book("25274", "Castles and Crenellations", "Historical", null, "H.P. Anderson", 5,1));
        books.add(new Book("51573", "The Knight's Sword", "Fantasy", null, "F.E. Anvil",4,0));
        books.add(new Book("98732", "Castles in Germany", "Historical", null, "L.K. Meyer",10,4));
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList <>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
