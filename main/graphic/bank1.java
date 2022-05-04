/*
 * Created by JFormDesigner on Fri Jul 02 12:49:05 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class bank1 extends JFrame {
    public int number = 0;
    public bank1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 1;
        this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        number = 2 ;
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setVisible(true);
        setResizable(false);
        var contentPane = getContentPane();
        setSize(385,240);
        //---- button1 ----
        button1.setText("build bank");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("enter to bank");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- label1 ----
        label1.setText("bank");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)
                    .addComponent(button2)
                    .addContainerGap(48, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(169, 169, 169))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(61, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
