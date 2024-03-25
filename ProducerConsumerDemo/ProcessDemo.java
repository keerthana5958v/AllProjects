package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ProcessDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        System.out.println("enter the maximum capacity: ");
        int maxCapacity = sc.nextInt();
        Queue<Integer> productQueue = new LinkedList<>();
        Thread producer = new Thread(){
            public void run(){
                synchronized (productQueue){
                    for (int i = 1; i <= numberOfProducts; i++) {
                        productQueue.add(i);
                        System.out.println("Produced " + i);
                        if ((i % maxCapacity == 0)) {
                            System.out.println("storage is full\n");
                            productQueue.notify();
                            if (numberOfProducts!=i) {
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
        };
        Thread consumer = new Thread(){
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
        };
        producer.start();
        consumer.start();
    }
}

