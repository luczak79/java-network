package java_sockets;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer {

	public static void main(String[] args) {
		
		
	    /*
	     * Problem z otwartym procesem: wykonaj w konsoli
	     * > netstat -ano | find "8080"
	     * znajdz proces w task manager and usun go 
	     * w przypadku JVM eclipse jest to javaw.exe
	     */
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(9090);
			boolean stop = false;
			while (!stop) {
				System.out.println("Waiting for clients...");
				Socket clientSocket = serverSocket.accept();
				System.out.println("Client is connected.");
				
				ClientThread clientThread = new ClientThread(clientSocket);
				clientThread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
