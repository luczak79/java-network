package java_http;

import java.net.*;

public class Main {

    private static ServerSocket serverSocket;

    public static void main(String[] args) {
        
        try
        {
            
            serverSocket = new ServerSocket(80);
            boolean isStop = false; 
            
            while(!isStop) // while server is not stopped
            {
                Socket clientSocket = serverSocket.accept(); //accept a client
                System.out.println("Client " + clientSocket.getInetAddress().getHostAddress() + " is connected"); // print client ip address
                ClientThread clientThread = new ClientThread(clientSocket); // create a new thread for each client
                clientThread.start(); //start the thread
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}

