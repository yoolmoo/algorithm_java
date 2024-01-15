package algo_8;

import java.util.LinkedList; // LinkedList를 임포트합니다.

public class InheritedQueue<E> extends LinkedList<E> implements QueueInterface<E> {
    
    public InheritedQueue() {
        super();
    }

    public void enqueue(E newItem) {
        addLast(newItem); // append 대신 addLast를 사용합니다.
    }

    public E dequeue() {
        return removeFirst(); // remove(0) 대신 removeFirst를 사용합니다.
    }

    public E front() {
        return getFirst(); // get(0) 대신 getFirst를 사용합니다.
    }

    public void dequeueAll() {
        clear();
    }
}
