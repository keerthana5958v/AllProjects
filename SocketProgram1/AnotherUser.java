
import java.io.IOException;
import java.net.Socket;

public class  AnotherUser{
    public static void main(String[] args) {
        AnotherUser obj = new AnotherUser();
        obj.requestConnection();
    }
    public void requestConnection(){
        try {
            Socket socket = new Socket("localhost", 9994);
            System.out.println("connection requested");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
