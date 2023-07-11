package bridge.test;

import bridge.impl.ArrayImpl;
import bridge.impl.LinkedListImpl;
import bridge.list.Queue;
import bridge.list.Stack;

public class ListTest {
    public static void main(String[] args) {

        Queue<String> arrayQueue = new Queue<>(new ArrayImpl<>());

        arrayQueue.enQueue("aaa");
        arrayQueue.enQueue("bbb");
        arrayQueue.enQueue("ccc");

        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println("===========================");

        Queue<String> linkedQueue = new Queue<>(new LinkedListImpl<>());

        linkedQueue.enQueue("aaa");
        linkedQueue.enQueue("bbb");
        linkedQueue.enQueue("ccc");

        System.out.println(linkedQueue.deQueue());
        System.out.println(linkedQueue.deQueue());
        System.out.println(linkedQueue.deQueue());
        System.out.println("===========================");

        Stack<String> arrayStack = new Stack<>(new ArrayImpl<>());

        arrayStack.push("aaa");
        arrayStack.push("bbb");
        arrayStack.push("ccc");

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println("===========================");

        Stack<String> stackLinkedList = new Stack<>(new LinkedListImpl<>());

        stackLinkedList.push("aaa");
        stackLinkedList.push("bbb");
        stackLinkedList.push("ccc");

        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println("===========================");


    }
}
