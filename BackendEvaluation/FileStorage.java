package org.example;

import java.io.*;
import java.util.Scanner;

public class FileStorage {
    FileWriter file = new FileWriter("/home/keerthanas/IdeaProjects/BackendEvaluation/src/main/java/org/example/Information.txt");
    BufferedWriter bw = new BufferedWriter(file);
    public FileStorage() throws IOException {
    }

    void createFile() throws FileNotFoundException {
        new File("/home/keerthanas/IdeaProjects/BackendEvaluation/src/main/java/org/example/Information.txt");
    }
    void writeToFile(String name , String number){
        try {
            bw.append(name+","+number);
            bw.newLine();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    void viewData(){
        try{
            FileReader file = new FileReader("/home/keerthanas/IdeaProjects/BackendEvaluation/src/main/java/org/example/Information.txt");
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {
//        FileStorage obj = new FileStorage();
//        obj.writeToFile("keerthana", "1234");
//        obj.writeToFile("kjhgfds","jhgfds");
//        obj.writeToFile("kjhgfds","jhgfds");
//        obj.writeToFile("kjhgfds","jhgfds");
//        obj.bw.close();

    }
}
