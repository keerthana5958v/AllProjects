import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    public static void main(String[] args) {
        ServerSide obj = new ServerSide();
        obj.createSocket();
    }
    public void createSocket(){
        try {
            ServerSocket ss = new ServerSocket(9990);
            System.out.println("waiting to receive connection");
            Socket s = ss.accept();
            System.out.println("connected :)");

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}