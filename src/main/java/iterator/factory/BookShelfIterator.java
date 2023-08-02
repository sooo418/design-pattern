package iterator.factory;

public class BookShelfIterator implements Iterator {

    private BookShelf list;
    private int index = 0;

    public BookShelfIterator(Aggregate list) {
        this.list = (BookShelf) list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = list.getAt(index);
        index++;
        return book;
    }

}
