public class Book extends Product {
    protected String author;

    public Book(int id, String name, int coast, String author) {
        super(id, name, coast);
        this.author = author;
    }
}