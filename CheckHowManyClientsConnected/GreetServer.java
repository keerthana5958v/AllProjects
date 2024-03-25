import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class GreetServer {
    ServerSocket serverSocket;
    Socket clientSocket;
    PrintWriter out;
    BufferedReader in;

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("\nconnection started");
            out.println("hello client");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void stop(){
        try{
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
            System.out.println("connection stopped");
        }
        catch (Exception exe){
            System.out.println(exe.getMessage());
        }
    }
    public static void main(String[] args) {
        GreetServer server=new GreetServer();
        server.start(6666);
//        server.stop();
    }
}