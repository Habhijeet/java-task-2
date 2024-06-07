import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    @Override
    public boolean issueBook(Book book, Member member) {
        if (!book.isIssued() && member.getCurrentIssuedBooks().size() < member.getMaxBooksIssued()) {
            book.setIssued(true);
            member.issueBook(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(Book book, Member member) {
        if (book.isIssued() && member.getCurrentIssuedBooks().contains(book)) {
            book.setIssued(false);
            member.returnBook(book);
            return true;
        }
        return false;
    }
}

