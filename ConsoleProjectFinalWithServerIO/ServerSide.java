import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class ServerSide {
    static ServerSocket ss;
    static DataInputStream dtaIn;

    ServerSide() throws IOException {
        ss = new ServerSocket(9999);
        System.out.println("waiting for clients");
        Socket soc = ss.accept();
        System.out.println("connected");
        dtaIn = new DataInputStream(soc.getInputStream());

        System.out.println(dtaIn.readUTF());
    }

    public static void main(String[] args) throws IOException {
        new ServerSide();
    }

}
class ClientSide{
    static DataOutputStream dout;
    static Socket s;
    public ClientSide() throws IOException {
        s = new Socket("localhost",9999);
        System.out.println("waiting to connect");
        dout =new DataOutputStream(s.getOutputStream());
        System.out.println("connected");
    }

    public static void main(String[] args) throws IOException {
//        new ClientSide();
//        throw new IOException();/
        throw new SocketException();
    }


}
