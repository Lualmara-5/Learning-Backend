public class Book {

    String title;
    String author;

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
    }

    public void info() {

        System.out.println("Title: " + title);
        System.out.println("Author:" + author + "\n");

    }

    public static void main(String[] args) {
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        Book book3 = new Book("Title3", "Author3");

        book1.info();
        book2.info();
        book3.info();
    }
}
