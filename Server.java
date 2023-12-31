import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.*;


public class SERVER
{
	Public static void main(String q[]) throws IOException
		{
		System.out.println("Hello welcome....");
		Int c=0;
		ServerSocket ss=new ServerSocket(9015); //binding
		
		InetAddress ipobj=InetAddress.getLocalHost();
		String host_name=ipobj.getHostName();
		String ip_address=ipobj.getHostAddress();
		
				
		while(true)
			{
			System.out.println("\nServer Running.....");
			System.out.println("\nServer wait for Client request....");
			Socket cs=ss.accept(); //listening
			c=c+1;
			System.out.println("Server established connection...." + c + " times...");
							
			DataInputStream in=new DataInputStream(cs.getInputStream());
			String msg=in.readUTF();
			System.out.println("Received Message From Client: " + msg);
		
					
			
			DataOutputStream out=new DataOutputStream(cs.getOutputStream());
			out.writeUTF("HI I am Server..MY IPADDRESS ="+ip_address+"\n Host Name: "+ host_name+ "\n Both HOSTNAME / IPADDRESS: "+ipobj+"\n"); 
			
			}
		}
}

