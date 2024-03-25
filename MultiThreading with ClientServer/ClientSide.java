import java.io.IOException;
import java.net.Socket;

public class ClientSide {
    public static void main(String[] args) {
        ClientSide obj = new ClientSide();
        obj.requestServer();
    }
    public void requestServer(){
        try {
            Socket s = new Socket("localhost", 9990);
            System.out.println(":) connected");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
