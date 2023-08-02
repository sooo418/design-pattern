package iterator.factory;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;
    Factory f = IteratorFactory.getInstance();

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public Book getAt(int index) {
        return books[index];
    }

    @Override
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator(int type) {
        return f.createProduct(this, type);
    }
}
