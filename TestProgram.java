public class TestProgram {
    public static void main(String[] args) {

        Student student = new Student();

        Resource book = new Book("Introduction to Algorithms");
        Resource journal = new Journal("Story of Mother Nature");

        student.borrowBook(book);
        student.borrowJournal(journal);
    }
}
