public class Journal implements Resource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowed Journal: " + title);
    }
}
