//server side program to implement  server client communication using datagram packet

import java.io.*;
import java.net.*;
class UDPServer {
    public static void main(String[] args) throws IOException{
        DatagramSocket socket= new DatagramSocket(6969);
        System.out.println("Server is listening");

        byte[] bytes=new byte[1024];
        DatagramPacket packet= new DatagramPacket(bytes,bytes.length);
        socket.receive(packet);
        InetAddress ip= packet.getAddress();
        int port= packet.getPort();
        String s="Hello Client";
        bytes=s.getBytes();
        packet=new DatagramPacket(bytes,bytes.length, ip, port);        
        socket.send(packet);
        socket.close();
        
    }
}
