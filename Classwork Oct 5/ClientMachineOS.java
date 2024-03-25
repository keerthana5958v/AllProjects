import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientMachineOS {

    public static void main(String[] args) {
        ClientMachineOS obj = new ClientMachineOS();
        requestServer();
    }
//    public void runCommand(){
//        String cmd = "ls";
//
//        System.out.println(System.getProperty("os.name"));
//        try{
//            Process process = Runtime.getRuntime().exec("uname");
//            process.waitFor();
//            InputStream error = process.getErrorStream();
//            InputStream result = process.getInputStream();
//
//            String l;
//            BufferedReader br = new BufferedReader(new InputStreamReader(error));
//            while((l = br.readLine()) != null){
//                System.out.println(cmd + "  error stream  " + l);
//            }
//            l= null;
//            br = new BufferedReader(new InputStreamReader(result));
//            while((l = br.readLine()) != null){
//                System.out.println(cmd + "  result  " + l);
//            }
//        }
//        catch (Exception o){
//            System.out.println(o.getMessage());
//        }
//    }

    public static boolean requestServer(){
        try {
            Socket client = new Socket("localhost", 9999);
            client.getOutputStream();
            return true;
        }
        catch (Exception io){
            io.getStackTrace();
        }
        return false;
    }
    public static String returnOSType(){
        if(requestServer()){
            return System.getProperty("os.name");
        }
        return null;
    }
}