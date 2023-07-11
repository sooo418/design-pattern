package bridge.list;

import bridge.impl.AbstractList;

public class Stack<T> extends List<T> {

    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("Stack을 만듭니다.");
    }

    public void push(T obj) {
        impl.insertElement(obj, 0);
    }

    public T pop() {
        return impl.deleteElement(0);
    }

    public T peek() {
        return impl.getElement(0);
    }
}
