package edu.northeastern.malik_y;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        //Question 1
        System.out.println("--Question 1--");
        ExecutorService service = Executors.newCachedThreadPool();
        ThreadSafeLinkedList threadSafeLinkedList = new ThreadSafeLinkedList();
        for(int i = 0; i < 3; i++) {
            service.submit(new List(threadSafeLinkedList, i));
        }
        service.shutdown();
        try {
            service.awaitTermination(10000, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
