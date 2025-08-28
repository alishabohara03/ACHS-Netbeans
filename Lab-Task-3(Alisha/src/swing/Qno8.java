/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author asyla
 */



public class Qno8 extends JFrame {

    JSlider slider;
    JList<String> list;
    JTable table;
    JProgressBar progressBar;
    JTree tree;
    JLabel sliderValueLabel;
    JLabel listSelectedLabel;

    public Qno8() {
        setTitle("Qno8 Swing Components Demo (Alisha Bohara)");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        setLocationRelativeTo(null);

        // Slider
        slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        sliderValueLabel = new JLabel("Slider Value: 50");

        slider.addChangeListener(e -> {
            int value = slider.getValue();
            sliderValueLabel.setText("Slider Value: " + value);
            progressBar.setValue(value); // link with progress bar
        });

        // List
        String[] subjects = {"Java", "Python", "C++", "JavaScript", "HTML"};
        list = new JList<>(subjects);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setPreferredSize(new Dimension(120, 80));

        listSelectedLabel = new JLabel("Selected: None");
        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selected = list.getSelectedValue();
                listSelectedLabel.setText("Selected: " + selected);
            }
        });

        // Table
        String[] columnNames = {"ID", "Name", "Course"};
        Object[][] data = {
                {1, "Alisha", "BSc CSIT"},
                {2, "Aayush", "BIM"},
                {3, "Sneha", "BIT"}
        };
        table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setPreferredSize(new Dimension(400, 100));

        // Progress Bar
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension(400, 25));

        // Tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Courses");
        DefaultMutableTreeNode programming = new DefaultMutableTreeNode("Programming");
        programming.add(new DefaultMutableTreeNode("Java"));
        programming.add(new DefaultMutableTreeNode("Python"));

        DefaultMutableTreeNode design = new DefaultMutableTreeNode("Design");
        design.add(new DefaultMutableTreeNode("UI/UX"));
        design.add(new DefaultMutableTreeNode("Graphics"));

        root.add(programming);
        root.add(design);
        tree = new JTree(root);
        JScrollPane treeScroll = new JScrollPane(tree);
        treeScroll.setPreferredSize(new Dimension(200, 150));

        // Add components to frame
        add(new JLabel("Slider:"));
        add(slider);
        add(sliderValueLabel);

        add(new JLabel("List:"));
        add(listScroll);
        add(listSelectedLabel);

        add(new JLabel("Table:"));
        add(tableScroll);

        add(new JLabel("Progress Bar:"));
        add(progressBar);

        add(new JLabel("Tree:"));
        add(treeScroll);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Qno8();
    }
}

