import java.io.IOException;
import java.net.Socket;

public class UserSideSocket {
    public static void main(String[] args) {
        UserSideSocket obj = new UserSideSocket();
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
