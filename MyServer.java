import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) throws IOException {
        // Create a server socket listening on port 4999
        try (ServerSocket serverSocket = new ServerSocket(4999)) {
    
            // Accept client connections
            Socket clientSocket = serverSocket.accept();
        
            System.out.println("A client is connected");
        
            // Read data sent by the client
            InputStreamReader inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
            String messageFromClient = bufferedReader.readLine();
            System.out.println("Client says: " + messageFromClient);
        
            // Send response to the client
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
            printWriter.println("Hi there!");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}