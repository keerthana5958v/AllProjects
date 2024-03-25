package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadingProblem {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> parent = new LinkedList<Integer>();
        Thread myThread = new Thread();
        System.out.println(myThread.isAlive());
        myThread.start();
        System.out.println(myThread.isAlive());
        for(int i = 1 ; i<=50 ; i++){
            parent.add(i);
        }
        System.out.println(parent);

        Queue<Integer> child = new LinkedList<Integer>();
        for(int i = 0 ; i < 10 ; i++){
            child.add(parent.poll());
        }
        System.out.println(child);
        System.out.println(parent);

    }
}
