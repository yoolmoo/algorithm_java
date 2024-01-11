package algo_6;

import java.util.ArrayList;

public class IntegerArrayList {
    private ArrayList<Integer> list;

    public IntegerArrayList() {
        this.list = new ArrayList<>();
    }

    public void add(int index, int element) {
        list.add(index, element);
    }

    public void append(int element) {
        list.add(element);
    }

    public void remove(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void removeItem(int element) {
        list.remove(Integer.valueOf(element));
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList();
        list.add(0, 300); // Autoboxing
        list.add(0, 200);
        list.add(0, 100);
        list.append(500);
        list.append(600);
        list.remove(3);
        list.add(3, 250);
        list.add(1, 50);
        list.add(0, 10);
        list.append(700);
        list.remove(1);
        list.removeItem(600);

        // Display the contents of the list
        System.out.println("List: " + list);
    }
}
