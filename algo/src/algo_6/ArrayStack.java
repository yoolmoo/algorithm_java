package algo_6;
import java.util.*;

public class ArrayStack<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        array = new Object[capacity];
        size = 0;
    }

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public void push(T element) {
        if (size == array.length) {
            resizeArray();
        }
        array[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T poppedElement = (T) array[--size];
        array[size] = null; // Optional: help with garbage collection
        return poppedElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> s = new ArrayStack<>(10);
        s.push(300);
        s.push(200);
        s.push(100);

        System.out.println("Stack after push operations:");
        while (!s.isEmpty()) {
        	System.out.println("Popped element: " + s.pop());
        }
    }
}
