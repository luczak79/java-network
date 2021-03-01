package java_ftp;

import java.io.*;
import java.net.*;

public class Server 
{
    private static ServerSocket serverSocket;

	public static void main(String [] args)
    {
        try
        {
            serverSocket = new ServerSocket(9090);
        
            //boolean variable to stop the server
            boolean isStopped = false;
            while(!isStopped)
            {
                //create client socket object
                Socket clientSocket = serverSocket.accept();
                //create and start client thread
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();
            }
        }
        catch(IOException e)
        {
            System.out.println("Port 9090 is already opened! Please use another port.");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
