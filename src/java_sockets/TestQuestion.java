package java_sockets;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestQuestion {

	public static void main(String[] args) {
//		InetAddress obj1=  null;
//		try {
//			obj1 = InetAddress.getByName("udemy.com");
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        System.out.print(obj1.getHostName());
		
		//QUESTION 2
		
		InetAddress obj1 = null;
		try {
			obj1 = InetAddress.getByName("udemy.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.print(obj1.getHostName());
	}

}
