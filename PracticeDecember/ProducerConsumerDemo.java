package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of products: ");
        int numberOfProducts = sc.nextInt();

        System.out.print("Enter the maximum capacity: ");
        int maxCapacity = sc.nextInt();

        Queue<Integer> product = new LinkedList<>();
        Producer producer = new Producer(product , numberOfProducts, maxCapacity);
        Consumer consumer = new Consumer(product , producer);

        producer.start();
        consumer.start();

        sc.close();
    }
}

