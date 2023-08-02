package iterator.factory;

public interface Aggregate {

    int getLength();

    Iterator iterator(int type);
}
