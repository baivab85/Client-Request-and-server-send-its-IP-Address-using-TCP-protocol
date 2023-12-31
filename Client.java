import java.io.*;
import java.net.*;
importjava.lang.*;

publicclass CLIENT_IP
{
	publicstaticvoid main(String args[]) throws IOException
	{
		Socket objclient = new Socket("localhost",9015);
		
		DataOutputStream dout=new DataOutputStream(objclient.getOutputStream());
				
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Message to Server:");
		String msg=br.readLine();
		
		dout.writeUTF(msg.toUpperCase()+"\n");
			
		
		DataInputStream din=new DataInputStream(objclient.getInputStream());
		String msgServer=din.readUTF();
		System.out.println("IPADDRESS= " + msgServer );
	}
}
