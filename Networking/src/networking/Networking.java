/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package networking;
import java.net.MalformedURLException;
import java.net.URL;


/**
 *
 * @author asyla
 */
public class Networking {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
         public static void main(String[] args) throws MalformedURLException {
        // TODO code application logic here
        URL aURL = new URL("http://example.com:80/docs/books/tutorial/index.html?name=networking#DOWNLOADING");
        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("host = " + aURL.getHost());
        System.out.println("port = " + aURL.getPort());
        System.out.println("path = " + aURL.getPath());
        System.out.println("query = " + aURL.getQuery());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("ref = " + aURL.getRef());
        
        
    }
    
}






    


