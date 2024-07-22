package java1.j47;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(22);
        l2.add(23);
        l2.add(6);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.addLast(7);
        l1.addFirst(0);
        l1.add(0, 9);
        l1.add(0, 10);
        l1.addAll(0, l2);
        System.out.println(l1.contains(22));
        System.out.println(l1.indexOf(22));
        System.out.println(l1.lastIndexOf(6));
//        l1.clear();
        int i = 0;
        while (i < l1.size()) {
            System.out.print(l1.get(i) + ",");
            i++;
        }
    }
}
