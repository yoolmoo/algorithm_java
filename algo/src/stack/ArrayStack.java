package stack;

public class ArrayStack<E> implements StackInterface<E> {
    private E[] stack;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;

    @SuppressWarnings("unchecked") // 타입 안정성 경고 무시
    public ArrayStack() {
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    @SuppressWarnings("unchecked") // 타입 안정성 경고 무시
    public ArrayStack(int n) {
        stack = (E[]) new Object[n];
        topIndex = -1;
    }

    public void push(E newItem) {
        if (isFull()) { /* 에러 처리 */}
        else stack[++topIndex] = newItem;
    }

    public E pop() {
        if (isEmpty()) return ERROR;
        else return stack[topIndex--];
    }

    public E top() {
        if (isEmpty()) return ERROR;
        else return stack[topIndex];
    }

    public boolean isEmpty() {
        return (topIndex < 0);
    }

    public boolean isFull() {
        return (topIndex == stack.length - 1);
    }

    @SuppressWarnings("unchecked") // 타입 안정성 경고 무시
    public void popAll() {
        stack = (E[]) new Object[stack.length];
        topIndex = -1;
    }
}
