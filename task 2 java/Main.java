public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create a librarian
        Librarian librarian = new Librarian(1, "Alice");

        // Create books
        Book book1 = new Book(101, "Effective Java", "Joshua Bloch");
        Book book2 = new Book(102, "Clean Code", "Robert C. Martin");
        Book book3 = new Book(103, "Design Patterns", "Erich Gamma");

        // Add books to the library
        librarian.addBook(book1, library);
        librarian.addBook(book2, library);
        librarian.addBook(book3, library);

        // Create members
        StudentMember0 student = new StudentMember0(2, "Bob");
        TeacherMember teacher = new TeacherMember(3, "Charlie");

        // Add members to the library
        library.getMembers().add(student);
        library.getMembers().add(teacher);

        // Issue books
        System.out.println("Issuing books:");
        System.out.println("Issue 'Effective Java' to Bob: " + library.issueBook(book1, student));
        System.out.println("Issue 'Effective Java' to Charlie: " + library.issueBook(book1, teacher)); // Already issued
        System.out.println("Issue 'Clean Code' to Bob: " + library.issueBook(book2, student));
        System.out.println("Issue 'Design Patterns' to Charlie: " + library.issueBook(book3, teacher));

        // Return books
        System.out.println("\nReturning books:");
        System.out.println("Return 'Effective Java' from Bob: " + library.returnBook(book1, student));
        System.out.println("Return 'Effective Java' from Charlie: " + library.returnBook(book1, teacher)); // Not issued to Charlie

        // Remove a book from the library
        System.out.println("\nRemoving 'Design Patterns' from the library by Alice");
        librarian.removeBook(book3, library);
    }
}

