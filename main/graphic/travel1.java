/*
 * Created by JFormDesigner on Tue Jun 29 14:48:48 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class travel1 extends JFrame {
    public String work = null;
    public String destination_terminals_name, origin_terminals_name, destination_city,
            drivers_name, vehicles_name, travel_date;
    public int vehicles_id;
    public travel1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        destination_terminals_name = textField1.getText();
        origin_terminals_name = textField2.getText();
        destination_city = textField3.getText();
        drivers_name = textField4.getText();
        vehicles_id = Integer.parseInt(textField5.getText());
        vehicles_name = textField6.getText();
        travel_date = textField7.getText();
        work = "ok";
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

        //======== this ========
        setVisible(true);
        setTitle("travel");
        setResizable(false);
        var contentPane = getContentPane();
        setSize(540,550);
        //---- label1 ----
        label1.setText("destination terminal's name:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label2 ----
        label2.setText("origin terminal's name:");
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label3 ----
        label3.setText("destination city:");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label4 ----
        label4.setText("driver's name:");
        label4.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label5 ----
        label5.setText("vehicle's id:");
        label5.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label6 ----
        label6.setText("vehicle's name:");
        label6.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label7 ----
        label7.setText("travel date: (dd/mm/yy)");
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
                    .addGap(56, 56, 56)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(textField7, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(textField6, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(textField2)
                        .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGap(87, 87, 87))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                    .addGap(95, 95, 95)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField6, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(textField7, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(33, 33, 33)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addContainerGap(19, Short.MAX_VALUE))
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
