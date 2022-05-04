/*
 * Created by JFormDesigner on Fri Jul 02 14:34:43 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class account_menu extends JFrame {
    public  int number = 0;
    public account_menu() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 1;
        this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        number =2;
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

        //======== this ========
        setVisible(true);
        setResizable(false);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        setSize(385,290);
        //---- button1 ----
        button1.setText("withdraw");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("deposite");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("all transactions");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("cancel");
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.addActionListener(e -> button4ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(47, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(76, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(71, Short.MAX_VALUE))
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
