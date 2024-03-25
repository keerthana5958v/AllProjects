package org.example;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        else {
            System.out.println("instance already exist");
        }
        return singleton;
    }
}

class demo{
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton oj = Singleton.getInstance();
        Singleton ob = Singleton.getInstance();

    }
}