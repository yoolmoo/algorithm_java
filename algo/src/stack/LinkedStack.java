package stack;

public class LinkedStack<E> implements StackInterface<E> {
    private Node<E> topNode;
    private final E ERROR = null; // 임의의 에러값

    public LinkedStack() {
        topNode = null;
    }

    // 스택에 원소 x 삽입하기
    public void push(E newItem) {
        topNode = new Node<>(newItem, topNode);
    }

    // 스택에서 원소 삭제하기
    public E pop() {
        if (isEmpty()) return ERROR;
        else {
            Node<E> temp = topNode;
            topNode = topNode.next;
            return temp.item;
        }
    }

    // 스택에서 탑 원소 알려주기
    public E top() {
        if (isEmpty()) return ERROR;
        else return topNode.item;
    }

    // 스택이 비었는지 확인하기
    public boolean isEmpty() {
        return (topNode == null);
    }

    // 스택 비우기
    public void popAll() {
        topNode = null;
    }

    // Node 클래스 정의
    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}
