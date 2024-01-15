// LinkedStack.java
package algo_8;

import java.util.LinkedList;

public class LinkedStack<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void push(E item) {
        list.addFirst(item);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
