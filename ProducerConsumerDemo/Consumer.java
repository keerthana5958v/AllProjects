package org.example;

import java.util.Queue;

public class Consumer extends Thread{
    int maxCapacity;
    int numberOfProducts;
    Queue<Integer> productQueue;
    SharedBuffer sharedBuffer = new SharedBuffer();
    public Consumer(int maxCapacity, int numberOfProducts) {
        this.maxCapacity = maxCapacity;
        this.numberOfProducts = numberOfProducts;
    }
    public void run(){
        synchronized (productQueue){
            for (int i = 1; i <= numberOfProducts; i++) {
                Integer item = productQueue.poll();
                System.out.println("Consumed: " + item);
                if ((i % maxCapacity == 0)) {
                    System.out.println("all available products are consumed by consumer\n");
                    productQueue.notify();
                    if (numberOfProducts!= i) {
                        try {
                            productQueue.wait();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        }
    }

}
