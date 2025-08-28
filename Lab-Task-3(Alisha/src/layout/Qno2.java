/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layout;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author asyla
 */
public class Qno2 extends JFrame {
    public Qno2() {
        setTitle("Qno2 - Layout Managers Demo (Alisha Bohara)");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, gap 10px
        
        // Panel 1 - FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        flowPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));
        flowPanel.add(new JButton("Button 4"));
        add(flowPanel);

        // Panel 2 - BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout(5, 5));
        borderPanel.setBorder(BorderFactory.createTitledBorder("BorderLayout"));
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);
        add(borderPanel);

        // Panel 3 - GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        gridPanel.setBorder(BorderFactory.createTitledBorder("GridLayout"));
        for (int i = 1; i <= 6; i++) {
            gridPanel.add(new JButton("Button " + i));
        }
        add(gridPanel);

        // Panel 4 - GridBagLayout
        JPanel gridBagPanel = new JPanel(new GridBagLayout());
        gridBagPanel.setBorder(BorderFactory.createTitledBorder("GridBagLayout"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0; gbc.gridy = 0;
        gridBagPanel.add(new JButton("Button 1"), gbc);

        gbc.gridx = 1; gbc.gridy = 0;
        gridBagPanel.add(new JButton("Button 2"), gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        gbc.gridwidth = 2;
        gridBagPanel.add(new JButton("Button 3 (span 2 cols)"), gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 1;
        gridBagPanel.add(new JButton("Button 4"), gbc);

        gbc.gridx = 1; gbc.gridy = 2;
        gridBagPanel.add(new JButton("Button 5"), gbc);
        add(gridBagPanel);

        // Panel 5 - GroupLayout
        JPanel groupPanel = new JPanel();
        groupPanel.setBorder(BorderFactory.createTitledBorder("GroupLayout"));

        GroupLayout layout = new GroupLayout(groupPanel);
        groupPanel.setLayout(layout);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(b3))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b2)
                    .addComponent(b4))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(b3)
                    .addComponent(b4))
        );

        add(groupPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Qno2();
    }
    
    
    
}
