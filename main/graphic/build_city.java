/*
 * Created by JFormDesigner on Mon Jun 28 18:08:56 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class build_city extends JFrame {
    public String name , work = null;
    public int money;
    public build_city() {
        initComponents();
    }


    private void button2ActionPerformed(ActionEvent e) {
        work="cancel";
        this.dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        money =Integer.parseInt(textField2.getText());
        name = textField1.getText();
        work = "ok";
        this.dispose();
    }

    private void textField1MouseClicked(MouseEvent e) {
        textField1.setText("");
    }

    private void textField2MouseClicked(MouseEvent e) {
        textField2.setText("");
    }

    private void textField1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void textField2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("build city");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        var contentPane = getContentPane();
        setSize(385,240);
        //---- label1 ----
        label1.setText("city name: ");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label2 ----
        label2.setText("money: ");
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- textField1 ----
        textField1.setText("city name");
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1MouseClicked(e);
            }
        });
        textField1.addActionListener(e -> textField1ActionPerformed(e));

        //---- textField2 ----
        textField2.setText("money");
        textField2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField2MouseClicked(e);
            }
        });
        textField2.addActionListener(e -> textField2ActionPerformed(e));

        //---- button1 ----
        button1.setText("ok");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("cancel");
        button2.addActionListener(e -> button2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(97, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                            .addComponent(button2, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(31, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(textField2)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap(88, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(textField2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(19, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
