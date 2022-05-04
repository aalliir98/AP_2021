/*
 * Created by JFormDesigner on Tue Jun 29 12:03:55 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class hire_leader extends JFrame {
    public int number =0;
    public String work=null, name;
    public hire_leader() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 1;
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
    }

    private void button2ActionPerformed(ActionEvent e) {
        number = 2;
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
    }

    private void button3ActionPerformed(ActionEvent e) {
        number = 3;
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
    }

    private void button4ActionPerformed(ActionEvent e) {
        number = 4;
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
    }

    private void button5ActionPerformed(ActionEvent e) {
        number = 5;
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
    }

    private void button6ActionPerformed(ActionEvent e) {
        work="ok";
        name = textField1.getText();
        this.dispose();
    }

    private void button7ActionPerformed(ActionEvent e) {
        work="cancel";
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button6 = new JButton();
        button7 = new JButton();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();
        setSize(535,520);
        //---- button1 ----
        button1.setText("Sailor");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("Pilot");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("Bus driver");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("Locomotive");
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.addActionListener(e -> button4ActionPerformed(e));

        //---- button5 ----
        button5.setText("Crew");
        button5.setFont(new Font("Arial", Font.BOLD, 14));
        button5.addActionListener(e -> button5ActionPerformed(e));

        //---- label1 ----
        label1.setText("which leader?");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        //---- label2 ----
        label2.setText("terminal name:");
        label2.setFont(new Font("Arial", Font.BOLD, 16));

        //---- button6 ----
        button6.setText("ok");
        button6.addActionListener(e -> button6ActionPerformed(e));

        //---- button7 ----
        button7.setText("cancel");
        button7.addActionListener(e -> button7ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                            .addGap(63, 63, 63))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(117, Short.MAX_VALUE))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(197, 197, 197)
                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .addGap(86, 86, 86)
                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(129, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(35, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button6;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
