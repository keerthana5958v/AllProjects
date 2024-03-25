import java.io.File;
import java.io.IOException;


// 1. create a txt file
// 2. sign up Class --> get userName check if already in txt file,  get password and validate


public class Main {
    // ~ method to create file ~
    public void createTxtFile(){
        try{
            File f = new File("/home/keerthanas/IdeaProjects/Login Signup FileHandling ass/src/UsernameContainer.txt");
            if (f.createNewFile()){
                System.out.println("file created");
            }
        }
        catch (IOException e){
            System.out.println("file exist already");
        }
    }

    // check if file exist, creates one, if it does not exist;
    public void doesFileExist(){
        File f = new File("/home/keerthanas/IdeaProjects/Login Signup FileHandling ass/src/UsernameContainer.txt");
        if (!f.exists()){
            createTxtFile();
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.doesFileExist();
    }
}