package visitor;

import java.util.Iterator;

public abstract class Entry implements Acceptor {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Iterator iterator() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

}
