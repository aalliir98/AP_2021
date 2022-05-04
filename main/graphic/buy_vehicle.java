/*
 * Created by JFormDesigner on Tue Jun 29 11:22:41 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class buy_vehicle extends JFrame {
    public int number = 0;
    public buy_vehicle() {
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

    private void button5ActionPerformed(ActionEvent e) {
        number = 5;
        this.dispose();
    }

    private void button6ActionPerformed(ActionEvent e) {
        number = 6;
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== this ========
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        var contentPane = getContentPane();
        setSize(565,390);
        //---- label1 ----
        label1.setText("which vehicle do you want to buy?");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        //---- button1 ----
        button1.setText("airliner");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("cargo plane");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("bus");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("boat");
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.addActionListener(e -> button4ActionPerformed(e));

        //---- button5 ----
        button5.setText("ship");
        button5.setFont(new Font("Arial", Font.BOLD, 14));
        button5.addActionListener(e -> button5ActionPerformed(e));

        //---- button6 ----
        button6.setText("train");
        button6.setFont(new Font("Arial", Font.BOLD, 14));
        button6.addActionListener(e -> button6ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button4, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGap(37, 37, 37)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button5, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button3, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addComponent(button6, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGap(58, 58, 58))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(label1)
                    .addContainerGap(151, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(label1, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addGap(73, 73, 73)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button4, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(button5, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(button6, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addContainerGap(44, Short.MAX_VALUE))
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
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
