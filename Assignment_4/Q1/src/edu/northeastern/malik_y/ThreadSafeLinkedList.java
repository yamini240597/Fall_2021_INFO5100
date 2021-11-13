package edu.northeastern.malik_y;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeLinkedList {
    private LinkedList<Integer> list = new LinkedList<>();

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(int element) {
        lock.writeLock().lock();
        list.add(element);
        lock.writeLock().unlock();
    }

    public void addAtPosition(int index, Integer i) {
        lock.writeLock().lock();
        list.add(index, i);
        lock.writeLock().unlock();
    }

    public void removeAtPosition(Integer index){
        lock.writeLock().lock();
        list.remove(index);
        lock.writeLock().unlock();
    }

    public Integer getFirst() {
        Integer e;
        lock.readLock().lock();
        e = list.getFirst();
        lock.readLock().unlock();
        return e;
    }

    public Integer getLast() {
        Integer e;
        lock.readLock().lock();
        e = list.getLast();
        lock.readLock().unlock();
        return e;
    }

    public int size() {
        int size;
        lock.readLock().lock();
        size = list.size();
        lock.readLock().unlock();
        return size;

    }
}
