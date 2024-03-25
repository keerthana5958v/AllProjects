import java.util.*;
import java.io.*;
public class ReversingLines {
    File file1 = new File("/home/keerthanas/IdeaProjects/FileWritingToAnotherFile/src/File1.txt");
    Scanner sc = null;
    public int numberOfLines(){
        try{
            int lineCount = 0;
            Scanner sc = new Scanner(file1);
            while (sc.hasNextLine()){
                lineCount++;
                sc.nextLine();
            }
            sc.close();
            return lineCount;
        }
        catch (Exception e){
            return 0;
        }
    }
    public String[] creatingLineArray(){
        try {
            int lineCount = numberOfLines();
            String [] lines = new String[lineCount];
            return lines;
        }
        catch (Exception e){
            System.out.println("No lines found");
            return null;
        }
    }
    public String[] appendingLines(){
        try{
            Scanner sc = new Scanner(file1);
            String [] lines = creatingLineArray();
            int index = 0;
            while (sc.hasNextLine()){
                lines[index] = sc.nextLine();
                index++;
            }
            sc.close();
            return lines;
        }
        catch(Exception e){
            System.out.println("File not found");
            return null;
        }
    }
    public String[] reverse(){
        try{
            String[] lines = appendingLines();
            String[] reversedLines = new String[lines.length];
            for (int i = 0; i < lines.length; i++){
                reversedLines[i] = lines[lines.length - i-1];
            }
            return reversedLines;
        }
        catch(Exception e){
            System.out.println("File not found");
            return null;
        }
    }
    public void reversedLinesInFile(){
        try{
            String [] reversedLines= reverse();
            FileWriter file2 = new FileWriter("/home/keerthanas/IdeaProjects/FileWritingToAnotherFile/src/File2.txt");
            for (String line : reversedLines){
                file2.write(line);
                file2.write("\n");
            }
            file2.close();
        }
        catch(Exception e){
            System.out.println("Exception type: "+ e.getMessage());
        }
    }
    public static void main(String[] args){
        ReversingLines lines = new ReversingLines();
        try {
            lines.reversedLinesInFile();
            System.out.println("Lines reversed and written");
        } catch (Exception e) {
            System.err.println("Error writing to file: ");
        }
    }
}