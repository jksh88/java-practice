import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5088)) {

            while(true) {
//                Socket socket = serverSocket.accept();
//                Echoer echoer = new Echoer(socket);
//                echoer.start();

                new Echoer(serverSocket.accept()).start();
                //this way, kick off a new thread every time a new connection is accepted
            }
        } catch(IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
}
