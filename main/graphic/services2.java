/*
 * Created by JFormDesigner on Fri Jul 02 01:48:25 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class services2 extends JFrame {
    public int number = 0;
    public services2() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 1 ;
        this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        number = 2;
        this.dispose();
    }

    private void button3ActionPerformed(ActionEvent e) {
        number = 3;
        this.dispose();
    }

    private void button4ActionPerformed(ActionEvent e) {
        number = 4;
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        var contentPane = getContentPane();
        setSize(435,255);
        //---- label1 ----
        label1.setText("choose your service");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        //---- button1 ----
        button1.setText("breakfast");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("food");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("pool");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(e -> button3ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(141, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(138, 138, 138))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(90, 90, 90))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
