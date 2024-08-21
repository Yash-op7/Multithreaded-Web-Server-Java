import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.function.Consumer;


public class Server {
    
    public Consumer<Socket> getConsumer() {     // functional interface, because we need to pass it in a function and these are first class citizens so they are treated the same as varaibles
    // returns a lambda, consumer interface doesn't return anything
    return (clientSocket) -> {
        try {
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
            
        } catch (IOException e) {
        }
    }
    }
    
    public static void main(String[] args) {
        int port = 8010;
        Server server = new Server();
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.getSoTimeout(10000);
            System.out.println("Server is listenign on port " + port);
            while (true) {  
                Socket accpetedSocket = serverSocket.accept();
                Thread thread = new Thread();       // runs a function which communicates with the corresponding connected client, associated with the new connection created

            }
        } catch (Exception e) {
        }
    }
    
}