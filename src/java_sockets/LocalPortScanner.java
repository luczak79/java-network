package java_sockets;
public class LocalPortScanner {

	public static void main(String[] args) {
		
		int port = 1;
		
		while(port <= 65535) {
			System.out.println("Port " + port + " is open!");
			port++;
		}
		
		System.out.println("KONIEC");
		
	}

}
