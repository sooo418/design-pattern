package iterator.factory;

public interface Iterator {

    public static final int FORWARD = 0;
    public static final int REVERSE = 1;

    boolean hasNext();

    Object next();
}
