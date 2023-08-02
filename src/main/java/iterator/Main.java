package iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator ir = bookShelf.iterator();
        while (ir.hasNext()) {
            Book book = (Book) ir.next();
            System.out.println(book.getName());
        }
    }
}
