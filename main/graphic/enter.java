/*
 * Created by JFormDesigner on Fri Jul 02 14:39:38 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class enter extends JFrame {
    public int number = 12;
    public enter() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 0;
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setResizable(false);
        setVisible(true);
        var contentPane = getContentPane();
        setSize(365,235);
        //---- button1 ----
        button1.setText("cancel");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- label1 ----
        label1.setText("click cancel button to cancel showing");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(39, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(label1)
                    .addGap(37, 37, 37)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
