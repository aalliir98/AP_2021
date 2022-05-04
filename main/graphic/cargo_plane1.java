/*
 * Created by JFormDesigner on Wed Jun 30 18:13:48 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class cargo_plane1 extends JFrame {
    public String work = null;
    public int Maximum_flight_altitude;
    public int Band_length, crew;
    public int capacity;
    public int id, portable_weight;
    public String company;
    public cargo_plane1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        work = "ok";
        capacity =Integer.parseInt(textField3.getText());
        id = Integer.parseInt(textField4.getText());
        company = textField2.getText();
        Maximum_flight_altitude = Integer.parseInt(textField1.getText());
        Band_length = Integer.parseInt(textField5.getText());
        portable_weight = Integer.parseInt(textField6.getText());
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
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        setSize(515,505);
        //======== this ========
        setVisible(true);
        setTitle("cargo plane");
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
        label4.setText("maximum flight altitude:");
        label4.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label5 ----
        label5.setText("band length:");
        label5.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label6 ----
        label6.setText("portable weight:");
        label6.setFont(new Font("Arial", Font.BOLD, 14));

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
                    .addGap(87, 87, 87)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(label3)
                        .addComponent(label1)
                        .addComponent(label2)
                        .addComponent(label5)
                        .addComponent(label6)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(textField6, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(87, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label5, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField6, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23))
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
