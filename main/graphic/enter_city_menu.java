/*
 * Created by JFormDesigner on Mon Jun 28 21:11:31 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class enter_city_menu extends JFrame {
    public String name, work = null;

    public enter_city_menu() {
        initComponents();
    }

    private void textField1MouseClicked(MouseEvent e) {
        textField1.setText("");
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
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setVisible(true);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        setSize(370,285);
        //---- label1 ----
        label1.setText("city name: ");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- textField1 ----
        textField1.setText("city name");
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1MouseClicked(e);
            }
        });

        //---- label2 ----
        label2.setText("Enter city name:");
        label2.setFont(new Font("Arial", Font.BOLD, 16));

        //---- button1 ----
        button1.setText("ok");
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("cancel");
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.addActionListener(e -> button2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
                    .addGap(51, 51, 51))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addComponent(label2)
                    .addGap(118, 118, 118))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGap(41, 41, 41))
        );
        setSize(370, 285);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
