package edu.northeastern.malik_y;

public class List<Integer> implements Runnable{

    ThreadSafeLinkedList list;
    int value;

    public List(ThreadSafeLinkedList list, int val) {
        this.list = list;
        this.value = val;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getId());
            list.add(value);
        }

        list.addAtPosition(0, 2000);
        list.removeAtPosition(30);
        System.out.println(list.getFirst());
        list.addAtPosition(99, 999);
        System.out.println(list.getLast());

        System.out.println("\nList Size: " + list.size());
    }
}