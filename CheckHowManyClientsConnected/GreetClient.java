import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GreetClient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public static void main(String[] args) {
        GreetClient obj = new GreetClient();
        obj.startConnection("127.0.0.1", 6666);
        try {
            obj.sendMessage("hello client");
        }
        catch (Exception exe){
            System.out.println(exe.getMessage());
        }
        obj.stopConnection();
    }

    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public String sendMessage(String msg) throws Exception{
        out.println(msg);
        return in.readLine();
    }

    public void stopConnection() {
        try {
            in.close();
            out.close();
            clientSocket.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}