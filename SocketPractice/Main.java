package org.example;

import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("requesting connection from server");
        Socket s = new Socket("10.52.0.207",9999);
    }
}