package java_sockets;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

/**
 *
 * @author catalin
 */
public class Ping {
    
    public static void main(String [] args) throws Exception
    {
        try
        {
            String hostAddress = "google.com";
            InetAddress host = InetAddress.getByName(hostAddress);
            System.out.println(host.isReachable(1000));

            
            Process p = Runtime.getRuntime().exec("ping " + hostAddress);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String commandOutput = "";
            boolean isReachable = true;
            // reading output stream of the command
            while ((commandOutput = inputStream.readLine()) != null) {
                //System.out.println(commandOutput);
                
                if(commandOutput.contains("Destination host unreachable"))
                {
                    isReachable = false;
                    break;
                }
                        
            }
            
            if(isReachable)
            {
                System.out.println("Host is reachable!");
            }
            else
            {
                System.out.println("Host is not reachable!");
            }
            
        

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}
