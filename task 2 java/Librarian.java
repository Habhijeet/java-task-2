public class Librarian {
    private int librarianID;
    private String name;

    public Librarian(int librarianID, String name) {
        this.librarianID = librarianID;
        this.name = name;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book, Library library) {
        library.getBooks().add(book);
    }

    public void removeBook(Book book, Library library) {
        library.getBooks().remove(book);;
    }
};