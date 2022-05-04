/*
 * Created by JFormDesigner on Thu Jul 01 13:00:47 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class boat1 extends JFrame {
    public String work = null;
    public int weight, fuel, minimum_depth;
    public int capacity;
    public int id;
    public String company, type;
    public boat1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        work = "ok";
        capacity =Integer.parseInt(textField1.getText());
        id = Integer.parseInt(textField2.getText());
        company = textField3.getText();
        minimum_depth = Integer.parseInt(textField7.getText());
        weight = Integer.parseInt(textField4.getText());
        fuel = Integer.parseInt(textField6.getText());
        type = textField5.getText();
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
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        setSize(485,580);
        //======== this ========
        setVisible(true);
        setResizable(false);
        setTitle("ship/boat");
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("capacity:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label2 ----
        label2.setText("ID:");
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label3 ----
        label3.setText("company:");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label4 ----
        label4.setText("weight:");
        label4.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label5 ----
        label5.setText("type:");
        label5.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label6 ----
        label6.setText("fuel:");
        label6.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label7 ----
        label7.setText("minimum depth:");
        label7.setFont(new Font("Arial", Font.BOLD, 14));

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
                    .addContainerGap(82, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(textField6, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(textField7, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                    .addContainerGap(82, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(126, Short.MAX_VALUE)
                    .addComponent(button1, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                    .addComponent(button2, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addContainerGap(102, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 19, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 19, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 19, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 19, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label5, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 19, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField6, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 19, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(textField7, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(17, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
