/*
 * Created by JFormDesigner on Fri Jul 02 02:14:59 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class terminal_name extends JFrame {
    public String work = null, name;
    public terminal_name() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        work = "ok";
        name = textField1.getText();
        this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        work = "cancel";
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setResizable(false);
        setVisible(true);
        var contentPane = getContentPane();
        setSize(380,245);
        //---- label1 ----
        label1.setText("hotel name:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

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
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(label1)
                            .addGap(18, 18, 18)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(53, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(31, Short.MAX_VALUE))
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
