/*
 * Created by JFormDesigner on Thu Jul 01 19:16:10 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class services1 extends JFrame {
    public int number = 0;
    public services1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
       number = 1;
       this.dispose();
    }

    private void button3ActionPerformed(ActionEvent e) {
        number = 2;
        this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setVisible(true);
        setResizable(false);
        var contentPane = getContentPane();
        setSize(400,335);
        //---- label1 ----
        label1.setText("choose your services:");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        //---- button1 ----
        button1.setText("restaurant");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("smoking room");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("bed set");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("hotel");
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.addActionListener(e -> button4ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(button2)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
                    .addGap(54, 54, 54))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(label1)
                    .addContainerGap(115, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(64, 64, 64))
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
