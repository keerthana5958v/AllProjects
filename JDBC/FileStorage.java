package org.example;

import java.io.*;
import java.util.Scanner;

public class FileStorage {




    void createFile() {
        try{
            new File("/home/keerthanas/IdeaProjects/JDBC/src/main/java/org/example/Information.txt");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    void writeToFile(String name , String number){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/home/keerthanas/IdeaProjects/JDBC/src/main/java/org/example/Information.txt"))){
            bw.append(name+","+number);
            bw.newLine();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    void viewData(){
        try(FileReader fileR = new FileReader("/home/keerthanas/IdeaProjects/JDBC/src/main/java/org/example/Information.txt");){
            Scanner sc = new Scanner(fileR);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {
        FileStorage obj = new FileStorage();
        obj.viewData();
        obj.writeToFile("keerthana", "1234");
        obj.viewData();

    }
}
