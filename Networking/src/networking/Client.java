/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author asyla
 */
public class Client {
         

public static void main(String a[])throws IOException
        
{
try
{
        System.out.println("CLIENT:......\n");
        Socket con=new Socket("localhost",95);
        BufferedReader in=new BufferedReader(new
        InputStreamReader(con.getInputStream()));

        PrintWriter out=new PrintWriter(con.getOutputStream(),true);
        while(true)
        {
            String s1=in.readLine();
            System.out.println("From Server:"+s1);
            System.out.print("Enter the messages to the server:");
            BufferedReader din=new BufferedReader(new
            InputStreamReader(System.in));
            String st=din.readLine();
            out.println(st);
            if(st.equalsIgnoreCase("Bye")||st==null)break;
        }
        in.close();
        out.close();
        con.close();
}
catch(UnknownHostException e){
        System.out.println(e);
}
}
}
    





