import java.io.IOException; 
import java.net.ServerSocket; 
import java.net.Socket;
import java.util.Date;
//SINGLE CLIENT HTTP SERVER
public class SimpleHTTPServer { 
  public static void main(String args[] ) throws IOException { 
    ServerSocket server = new ServerSocket(8080); 
    System.out.println("Listening for connection on port 8080 ...."); 
    while (true) { 
      try(Socket clientSocket = server.accept()){
        Date today = new Date();
        String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
        clientSocket.getOutputStream()
        .write(httpResponse.getBytes("UTF-8"));
      } 
    } 
  } 
}
