/*
 * Created by JFormDesigner on Wed Jun 30 14:09:47 IRDT 2021
 */

package main.graphic;

import main.exception.invalid_input;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class airport1 extends JFrame {
    public boolean type;
    public int number_of_runway, area;
    public String terminal_name, address, work =null;
    public airport1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        work = "ok";

        number_of_runway =(int)spinner1.getValue();
        area =Integer.parseInt(textField3.getText());
        terminal_name = textField1.getText();
        address = textField2.getText();
        this.dispose();
    }

    private void radioButton1ActionPerformed(ActionEvent e) {
        type = true;
        radioButton2.setEnabled(false);
    }

    private void radioButton2ActionPerformed(ActionEvent e) {
        type=false;
        radioButton1.setEnabled(false);
    }

    private void button2ActionPerformed(ActionEvent e) {
        work = "cancel";
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label2 = new JLabel();
        spinner1 = new JSpinner();
        label3 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        textField2 = new JTextField();
        label5 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        var contentPane = getContentPane();
        setSize(465,420);
        //---- label1 ----
        label1.setText("type:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- radioButton1 ----
        radioButton1.setText("true");
        radioButton1.setFont(new Font("Arial", Font.BOLD, 12));
        radioButton1.addActionListener(e -> radioButton1ActionPerformed(e));

        //---- radioButton2 ----
        radioButton2.setText("false");
        radioButton2.setFont(new Font("Arial", Font.BOLD, 12));
        radioButton2.addActionListener(e -> radioButton2ActionPerformed(e));

        //---- label2 ----
        label2.setText("number of runway:");
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label3 ----
        label3.setText("terminal name:");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label4 ----
        label4.setText("address:");
        label4.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label5 ----
        label5.setText("area:");
        label5.setFont(new Font("Arial", Font.BOLD, 14));

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
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(textField1)
                                        .addComponent(textField2)))
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label2)
                                        .addComponent(label1))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(radioButton1)
                                            .addGap(18, 18, 18)
                                            .addComponent(radioButton2)))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGap(76, 76, 76))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(radioButton1)
                                .addComponent(radioButton2))
                            .addGap(25, 25, 25))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label2;
    private JSpinner spinner1;
    private JLabel label3;
    private JTextField textField1;
    private JLabel label4;
    private JTextField textField2;
    private JLabel label5;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
