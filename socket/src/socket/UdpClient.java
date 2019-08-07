package socket;
import java.io.*;
import java.net.*;

public class UdpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket client = new DatagramSocket(5070);
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
			packet.setPort(5060);
			packet.setAddress(InetAddress.getLocalHost());
			packet.setData("Hello Server".getBytes());
			client.send(packet);
			client.receive(packet);
			System.out.println(packet.getAddress().getHostName() +
					"(" + packet.getPort() + ")" + new String(packet.getData()));
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
