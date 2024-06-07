public class TeacherMember extends Member {

    public TeacherMember(int memberID, String name) {
        super(memberID, name, 10); // Teachers can issue up to 10 books
    }
}
