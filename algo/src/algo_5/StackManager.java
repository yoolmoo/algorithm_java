package algo_5;

import java.util.ArrayList;

public class StackManager {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack_1<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (true) {
            Integer n = stack.pop();
            if (n == null) break;
            System.out.print(n + " ");
        }
    }
}

interface IStack<T> {
    T pop();
    boolean push(T ob);
}

class MyStack_1<T> implements IStack<T> {
    ArrayList<T> l = null;

    public MyStack_1() {
        l = new ArrayList<T>();
    }

    public T pop() {
        if (l.size() == 0)
            return null;
        else
            return l.remove(l.size() - 1); // 리스트의 마지막 원소를 반환
    }

    public boolean push(T ob) {
        l.add(ob); // 리스트의 끝에 추가
        return true;
    }
}

