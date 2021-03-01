package java_sockets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {


		try {
			
			InetAddress serverAddress = InetAddress.getByName("localhost");
			System.out.println("server ip address: " + serverAddress.getHostAddress());
			Socket socket = new Socket(serverAddress, 9090);
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(input.readLine());
			out.println("hello server!");
			input.close();
			out.close();
			socket.close();
			System.out.println("THE END");
			
		} catch (UnknownHostException e1) {
			System.out.println("Unknown Host Exception: " + e1.getMessage());
		} catch (IOException e2) {
			System.out.println("IOException: " + e2.getMessage());
		} catch (IllegalArgumentException e3) {
			System.out.println("Illegal Argument Exception: " +  e3.getStackTrace());
		}

	}

}
