import java.net.*;
import java.io.*;
class Server{
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(4999);
        Socket s= ss.accept();
        System.out.println("Client Connected");

        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bin= new BufferedReader(in);
        String str=bin.readLine();
        System.out.println("Client"+str);

        PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
        pw.println("hello client");
        pw.flush();
        
        s.close();
        ss.close();
    }
}