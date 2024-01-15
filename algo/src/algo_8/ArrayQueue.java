package algo_8;
import java.util.Queue;

public class ArrayQueue<E> implements QueueInterface<E> {
    private E queue[];
    private int front, tail, numItems;
    private static final int DEFAULT_CAPACITY = 64;

    public ArrayQueue(int n) {
        queue = (E[]) new Object[n];
        front = 0;
        tail = n - 1;
        numItems = 0;
    }

    public ArrayQueue() {
        queue = (E[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        tail = queue.length - 1;
        numItems = 0;
    }

    private boolean isFull() {
        return (numItems == queue.length);
    }

    public void enqueue(E newItem) {
        if (isFull()) {
            resize();
        }
        tail = (tail + 1) % queue.length;
        queue[tail] = newItem;
        numItems++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            E queueFront = queue[front];
            front = (front + 1) % queue.length;
            numItems--;
            return queueFront;
        }
    }

    public E front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else return queue[front];
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public void dequeueAll() {
        queue = (E[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        tail = queue.length - 1;
        numItems = 0;
    }

    private void resize() {
        int newCapacity = queue.length * 2;
        E[] newQueue = (E[]) new Object[newCapacity];

        for (int i = 0; i < numItems; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }

        queue = newQueue;
        front = 0;
        tail = numItems - 1;
    }
}
