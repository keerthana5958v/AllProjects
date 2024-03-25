import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {
        FileReading obj = new FileReading();
        System.out.println("reading file content:\n"+obj.readFile());
        System.out.println("character count: "+obj.countChar(obj.readFile()));
        System.out.println("word count: "+obj.countWords(obj.readFile()));
        System.out.println("line count: "+obj.countLines(obj.readFile()));
        System.out.println("is substring: "+obj.isSubstring(obj.readFile() , "star"));
        System.out.println("is substring: "+obj.isSubstring(obj.readFile() , "goblin"));

    }
    public String readFile() {
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/keerthanas/IdeaProjects/CountCharsFromFile/src/File.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return content;
    }
    public int countChar(String content){
        return (content.length());
    }
    public int countWords(String content){
        int count = 1;
        if(content.isEmpty()){
            count=0;
        }
        for(int i = 0 ; i < content.length() -1; i++){
            if ((content.charAt(i)==' ' || content.charAt(i)=='\n') && content.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
    public int countLines(String content){
        int lines = 0;
        if (readFile()==null || readFile()==""){
            return 0;
        }
        else {
            for (int i = 0; i < content.length(); i++) {
                if (content.charAt(i) == '\n') {
                    lines++;
                }
            }
        }
        return lines;
    }
    public String isSubstring(String content, String substring){
        return substring +": " +(content.contains(substring));
    }

}