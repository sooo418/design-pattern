package iterator.factory;

public class ReverseShelfIterator implements Iterator {

    private BookShelf list;
    private int index;

    public ReverseShelfIterator(Aggregate list) {
        this.list = (BookShelf) list;
        index = list.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        if (index >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (index >= 0) {
            Book book = list.getAt(index);
            index--;
            return book;
        }
        return null;
    }
}
