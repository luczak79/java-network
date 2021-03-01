package java_stmp;

import java.io.*;
import java.net.*;

import java_sockets.ClientThread;

public class Server 
{
    private static ServerSocket serverSocket;

	public static void main(String [] args)
    {
        try
        {
            serverSocket = new ServerSocket(9090);
        
            boolean isStopped = false;
            while(!isStopped)
            {
                Socket clientSocket = serverSocket.accept();
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
