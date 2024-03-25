package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Consumer extends Thread {
    public Consumer(Queue<Integer> consumedProducts, Producer producer) {
        this.consumedProducts = consumedProducts;
        this.producer = producer;
    }

    private Queue<Integer> consumedProducts = new LinkedList<>();
    private Producer producer;

    public void run() {
        synchronized (consumedProducts) {
            for (int i = 1; i <= producer.getNumberOfProducts(); i++) {
                Integer item = consumedProducts.poll();
                System.out.println("Consumed: " + item);

                if (i == producer.getNumberOfProducts() || (i % producer.getMaxCapacity()) == 0) {
                    System.out.println("all available products are consumed by consumer\n");
                    consumedProducts.notify();
                    if (producer.getNumberOfProducts() != i) {
                        try {
                            consumedProducts.wait();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        }

    }
}
