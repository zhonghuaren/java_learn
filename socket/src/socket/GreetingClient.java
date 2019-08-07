package socket;
import java.net.*;
import java.io.*;

public class GreetingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		try {
			System.out.println("SERVER : " + serverName + " port : " + port);
			Socket client = new Socket(serverName, port);
			System.out.println("remote ip : " + client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("hello from " + client.getLocalSocketAddress());
			
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("receive from server : " + in.readUTF());
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
