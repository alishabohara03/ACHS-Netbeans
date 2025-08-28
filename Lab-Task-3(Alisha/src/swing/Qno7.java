/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author asyla
 */

public class Qno7 extends JFrame {

    public Qno7() {
        setTitle(" Qno-7 Menu Example (Alisha Bohara");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // Menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // Mnemonic: Alt + F

        // Menu items
//        JMenuItem openItem = new JMenuItem("Open", new ImageIcon("src/swing/folder.png"));

ImageIcon folderIcon = new ImageIcon("src/swing/folder.png");
Image scaledImage = folderIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
ImageIcon scaledIcon = new ImageIcon(scaledImage);

JMenuItem openItem = new JMenuItem("Open", scaledIcon);
 
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        exitItem.addActionListener(e -> System.exit(0)); // Handle event

        // Add to file menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // View menu with radio buttons
        JMenu viewMenu = new JMenu("View");
        JRadioButtonMenuItem lightMode = new JRadioButtonMenuItem("Light Mode", true);
        JRadioButtonMenuItem darkMode = new JRadioButtonMenuItem("Dark Mode");

        ButtonGroup themeGroup = new ButtonGroup();
        themeGroup.add(lightMode);
        themeGroup.add(darkMode);

        viewMenu.add(lightMode);
        viewMenu.add(darkMode);

        // Checkable menu items
        JCheckBoxMenuItem showStatusBar = new JCheckBoxMenuItem("Show Status Bar", true);
        JCheckBoxMenuItem showToolbar = new JCheckBoxMenuItem("Show Toolbar", false);
        viewMenu.addSeparator();
        viewMenu.add(showStatusBar);
        viewMenu.add(showToolbar);

        // Help menu with disabled item
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About", new ImageIcon("src/swing/file.png"));



        JMenuItem updateItem = new JMenuItem("Check for Updates");
        updateItem.setEnabled(false); // Disabled item

        helpMenu.add(aboutItem);
        helpMenu.add(updateItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        // Set the menu bar to frame
        setJMenuBar(menuBar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Qno7();
    }
}



