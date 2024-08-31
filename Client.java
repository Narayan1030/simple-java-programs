//client side program for client server communication using TCP/IP 
import java.net.*;
import java.io.*;
class Client{
     public static void main(String[] args) throws IOException {
        Socket s= new Socket("localHost",4999);

        PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
        pw.println("Hello Server");
        pw.flush();

        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bin= new BufferedReader(in);
        String str = bin.readLine();
        System.out.println("Server"+" "+str);


        s.close();
        
    }
}
