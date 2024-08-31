

import java.io.*;
import java.net.*;
class UDPClient{
    public static void  main(String args[]) throws IOException{
        DatagramSocket socket= new DatagramSocket();
         byte bytes[]=new byte[1024];
         InetAddress ip= InetAddress.getByName("localhost");

         DatagramPacket packet=new DatagramPacket(bytes, bytes.length, ip, 6969);
         socket.send(packet);

         socket.receive(packet);

         String received=new String(packet.getData());
         System.out.println("Server says:" +" "+received);
        socket.close();
        }

}