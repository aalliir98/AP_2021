/*
 * Created by JFormDesigner on Fri Jul 02 13:38:40 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class bank_menu extends JFrame {
    public  int number = 0;
    public bank_menu() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 1;
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
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setVisible(true);
        setResizable(false);
        var contentPane = getContentPane();
        setSize(405,315);
        //---- button1 ----
        button1.setText("new account");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("enter to account");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("information");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("cancel");
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.addActionListener(e -> button4ActionPerformed(e));

        //---- label1 ----
        label1.setText("bank menu");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(47, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(158, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(162, 162, 162))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(57, Short.MAX_VALUE))
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
