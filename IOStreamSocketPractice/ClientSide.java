import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter data: ");

            String data = scanner.nextLine();

            char type = 's'; // s for string
            byte[] dataInBytes = data.getBytes(StandardCharsets.UTF_8);

            out.writeChar(type);
            out.writeInt(dataInBytes.length);
            out.write(dataInBytes);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class ServerSide {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        Socket socket = server.accept();
        DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

        char dataType = in.readChar();
        int length = in.readInt();

        if (dataType == 's') {
            byte[] messageByte = new byte[length];
            in.readFully(messageByte);  // Read the entire message
            String dataString = new String(messageByte, StandardCharsets.UTF_8);
            System.out.println("Received data: " + dataString);
        }

        socket.close();
        server.close();
    }
}
