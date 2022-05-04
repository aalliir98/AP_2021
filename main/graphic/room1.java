/*
 * Created by JFormDesigner on Fri Jul 02 02:36:08 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class room1 extends JFrame {
    public String work = null;
    public int rooms_number;
    public int number_of_bed, area;
    public int price;
    public room1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        work = "ok";
        rooms_number = Integer.parseInt(textField1.getText());
        number_of_bed = Integer.parseInt(textField2.getText());
        area = Integer.parseInt(textField3.getText());
        price = Integer.parseInt(textField4.getText());
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
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setVisible(true);
        setResizable(false);
        var contentPane = getContentPane();
        setSize(490,425);
        //---- label1 ----
        label1.setText("room's number:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label2 ----
        label2.setText("number of bed:");
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label3 ----
        label3.setText("area:");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label4 ----
        label4.setText("price:");
        label4.setFont(new Font("Arial", Font.BOLD, 14));

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
                            .addGap(86, 86, 86)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addComponent(label2)
                                .addComponent(label3)
                                .addComponent(label4))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(84, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(39, 39, 39)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(49, 49, 49))
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
