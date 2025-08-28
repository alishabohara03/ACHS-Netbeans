/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author asyla
 */
public class Server {
    

    public static void main(String a[])throws IOException
{
try
{
        System.out.println("SERVER:......\n");
        ServerSocket s=new ServerSocket(95);
        System.out.println("Server Waiting For The Client");
        Socket cs=s.accept();
        InetAddress ia=cs.getInetAddress();
        String cli=ia.getHostAddress();//host adress of client
        System.out.println("Connected to the client with IP:"+cli);
    BufferedReader in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
    PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
do
{
        BufferedReader din=new BufferedReader(new
        InputStreamReader(System.in));
        System.out.print("To Client:");
        String tocl=din.readLine();
        out.println(tocl);
        String st=in.readLine();
        if(st.equalsIgnoreCase("Bye")||st==null)break;

        System.out.println("From Client:"+st);
        }while(true);
        in.close();
        out.close();
        cs.close();
}
catch(IOException e) {
            System.out.println(e);
}
}
}
