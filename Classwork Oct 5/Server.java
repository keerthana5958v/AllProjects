import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        Server ser = new Server();
        System.out.println("operating system of client: "+ ser.getOSType());
    }
    public boolean checkRequest(){
        try {
            ServerSocket sv = new ServerSocket(9999);
            System.out.println("connection requested");
            Socket sock = sv.accept();
            System.out.println("connection secure");
            return true;

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public String getOSType(){
        if(checkRequest()){
            return (ClientMachineOS.returnOSType());
        }
        return null;
    }
}
