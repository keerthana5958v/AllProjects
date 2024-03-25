import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("waiting for clients");
        Socket soc = ss.accept();
        System.out.println("connected");

        DataInputStream dtaIn = new DataInputStream(soc.getInputStream());
        System.out.println(dtaIn.readUTF());
    }
}