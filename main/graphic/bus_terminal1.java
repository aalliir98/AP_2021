/*
 * Created by JFormDesigner on Wed Jun 30 14:49:10 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class bus_terminal1 extends JFrame {
    public String work = null;
    public int  area;
    public String terminal_name, address;
    public bus_terminal1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
       work = "ok";
       area = Integer.parseInt(textField3.getText());
       terminal_name = textField1.getText();
       address = textField2.getText();
       this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        work = "cancel";
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("terminal name:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label2 ----
        label2.setText("address:");
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label3 ----
        label3.setText("area:");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        //---- button1 ----
        button1.setText("ok");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("cancel");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));
        setSize(450,355);
        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(110, Short.MAX_VALUE)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                    .addGap(83, 83, 83)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                    .addGap(100, 100, 100))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addContainerGap(102, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
