import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberID;
    private String name;
    private int maxBooksIssued;
    private List<Book> currentIssuedBooks;

    public Member(int memberID, String name, int maxBooksIssued) {
        this.memberID = memberID;
        this.name = name;
        this.maxBooksIssued = maxBooksIssued;
        this.currentIssuedBooks = new ArrayList<>();
    }

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public int getMaxBooksIssued() {
        return maxBooksIssued;
    }

    public List<Book> getCurrentIssuedBooks() {
        return currentIssuedBooks;
    }

    public void issueBook(Book book) {
        currentIssuedBooks.add(book);
    }

    public void returnBook(Book book) {
        currentIssuedBooks.remove(book);
    }
}
