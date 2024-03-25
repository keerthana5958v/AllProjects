import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSideSocket {
    public static void main(String[] args) {
        ServerSideSocket obj = new ServerSideSocket();
        obj.createServerSocket();
    }
    public void createServerSocket(){
        try{
            ServerSocket ss = new ServerSocket(9994);
            System.out.println("waiting to receive connection...");
            Socket socket = ss.accept();
            System.out.println("connected :)");
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
