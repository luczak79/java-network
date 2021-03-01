package java_sockets;
import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) {

		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address.getHostAddress());
			System.out.println(address.getCanonicalHostName());
			System.out.println(address.getHostName());
			
			System.out.println("----==== GOOGLE ====----");
			InetAddress address2 = InetAddress.getByName("google.com");
			System.out.println(address2.getHostAddress());
			System.out.println(address2.getHostName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
