package udemyExcercises.libraryApp;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        //app.searchByIsbn("25274");
        //app.searchByIsbn("29999");
        //app.searchByIsbn("83471");
        //app.searchByTitle("night");
        app.checkOutBook("83471");
        app.checkOutBook("83471");
        app.checkOutBook("83471");
        app.checkOutBook("83471");
    }
}