package org.example;

import java.util.Queue;

public class Producer extends Thread {
    public Producer(Queue<Integer> productQueue, int numberOfProducts, int interval) {
        this.productQueue = productQueue;
        this.numberOfProducts = numberOfProducts;
        this.maxCapacity = interval;
    }

    private int numberOfProducts = 0;
    private Queue<Integer> productQueue;
    private int maxCapacity = 0;

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void run() {
        synchronized (productQueue) {
            for (int i = 1; i <= getNumberOfProducts(); i++) {

                productQueue.add(i);
                System.out.println("Produced " + i);

                if ((i % getMaxCapacity() == 0) || (i == getNumberOfProducts())) {
                    System.out.println("storage is full\n");
                    productQueue.notify();
                    if (i != getNumberOfProducts()) {
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
