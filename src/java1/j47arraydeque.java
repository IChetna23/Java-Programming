package java1;

import java.util.ArrayDeque;

public class j47arraydeque {
    public static void main(String[] args) {
            ArrayDeque<Integer> l1 = new ArrayDeque<>();
            ArrayDeque<Integer> l2 = new ArrayDeque<>(3);
            l2.add(22);
            l2.add(23);
            l2.add(6);
            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(5);
            l1.addFirst(9);
            l1.addLast(10);
            System.out.println(l1.contains(22));
//        l1.clear();
        System.out.println(l1);
        }
    }

