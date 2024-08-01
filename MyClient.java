import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) throws IOException {
        // Connect to the server on localhost at port 4999
        try (Socket socket = new Socket("localhost", 4999)) {
    
            // Send a message to the server
            PrintWriter outputWriter = new PrintWriter(socket.getOutputStream());
            outputWriter.println("Hello from client");
            outputWriter.flush();
        
            // Read the response from the server
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
            String messageFromServer = bufferedReader.readLine();
            System.out.println("Server says: " + messageFromServer);
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
}