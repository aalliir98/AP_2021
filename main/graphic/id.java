/*
 * Created by JFormDesigner on Tue Jun 29 14:16:13 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class id extends JFrame {
    public String work=null;
    public int id=-1;
    public id() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
       work = "ok";
       id = Integer.parseInt(textField1.getText());
       this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        work= "cancel";
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();
        setSize(370,240);
        //---- label1 ----
        label1.setText("ID:");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        //---- button1 ----
        button1.setText("ok");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("cancel");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(47, 47, 47)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                    .addGap(81, 81, 81))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                    .addGap(57, 57, 57))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(34, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
