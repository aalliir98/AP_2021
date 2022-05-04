/*
 * Created by JFormDesigner on Tue Jun 29 00:10:15 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class choose_terminal extends JFrame {
    public  int number=0;
    public choose_terminal() {
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e) {
        number = 3;
        this.dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 1;
        this.dispose();
    }

    private void button3ActionPerformed(ActionEvent e) {
        number = 2;
        this.dispose();
    }

    private void button4ActionPerformed(ActionEvent e) {
        number = 4;
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setTitle("terminal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        var contentPane = getContentPane();
        setSize(295,300);
        //---- button1 ----
        button1.setText("airport");
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("shipping port");
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("bus terminal");
        button3.setFont(new Font("Arial", Font.BOLD, 12));
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("train station");
        button4.setFont(new Font("Arial", Font.BOLD, 12));
        button4.addActionListener(e -> button4ActionPerformed(e));

        //---- label1 ----
        label1.setText("choose your terminal");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(33, 33, 33)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button2)
                        .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(25, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(67, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                    .addGap(52, 52, 52))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button3, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(button4, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                    .addContainerGap(41, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
