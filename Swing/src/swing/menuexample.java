/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing. *;

/**
 *
 * @author asyla
 */
public class menuexample {
    JMenu menu, submenu, test;
    JMenuItem i1, i2, i3, i4,i5;
    menuexample() {
        JFrame f= new JFrame("ACHS College");
        JMenuBar mb = new JMenuBar();
        menu=new JMenu("Menu");
        test= new JMenu("Hello");
        submenu= new JMenu("Project");
        i1=new JMenuItem("Java");
        i2=new JMenuItem("DWDM");
        i3=new JMenuItem("POM");
        i4=new JMenuItem("DML");
        i5=new JMenuItem("Image processing");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        submenu.add(i5);
        
        menu.add(submenu);
        mb.add(menu);
        mb.add(test);
        test.add(i1);
        mb.add(submenu);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        f.setVisible(true);
        
        
    }
    
    public static void main(String args[])
    {
    new menuexample();
    }
    
}
