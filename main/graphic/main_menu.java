package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Jun 28 16:12:09 IRDT 2021
 */



/**
 * @author srdfgb
 */
public class main_menu extends JFrame {
    public int number=0;
    public main_menu() {
        initComponents();
    }

    private void button7ActionPerformed(ActionEvent e) {
        number =5;
        this.dispose();
    }

    private void button9ActionPerformed(ActionEvent e) {
        number = 8;
        this.dispose();
    }

    private void button6ActionPerformed(ActionEvent e) {
        number = 4;
        this.dispose();
    }

    private void button5ActionPerformed(ActionEvent e) {
        number = 3;
        this.dispose();
    }

    private void button4ActionPerformed(ActionEvent e) {
        number = 7;
        this.dispose();
    }

    private void button3ActionPerformed(ActionEvent e) {
        number = 2;
        this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        number = 6;
        this.dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 1;
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button9 = new JButton();
        label2 = new JLabel();

        //======== this ========
        setTitle("main menu");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        var contentPane = getContentPane();
        setSize(655,390);
        //---- label1 ----
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label1.setText("welcome to your country");

        //======== panel1 ========
        {

            //---- button1 ----
            button1.setText("build new city");
            button1.setFont(new Font("sansserif", Font.BOLD, 14));
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- button2 ----
            button2.setText("delete all informations");
            button2.setFont(new Font("sansserif", Font.BOLD, 14));
            button2.addActionListener(e -> button2ActionPerformed(e));

            //---- button3 ----
            button3.setText("Enter city menu");
            button3.setFont(new Font("sansserif", Font.BOLD, 14));
            button3.addActionListener(e -> button3ActionPerformed(e));

            //---- button4 ----
            button4.setText("Financial Management");
            button4.setFont(new Font("sansserif", Font.BOLD, 14));
            button4.addActionListener(e -> button4ActionPerformed(e));

            //---- button5 ----
            button5.setText("show city's information");
            button5.setFont(new Font("sansserif", Font.BOLD, 14));
            button5.addActionListener(e -> button5ActionPerformed(e));

            //---- button6 ----
            button6.setText("show country's information");
            button6.setFont(new Font("sansserif", Font.BOLD, 14));
            button6.addActionListener(e -> button6ActionPerformed(e));

            //---- button7 ----
            button7.setText("save");
            button7.setFont(new Font("sansserif", Font.BOLD, 14));
            button7.addActionListener(e -> button7ActionPerformed(e));

            //---- button9 ----
            button9.setText("exit");
            button9.setFont(new Font("sansserif", Font.BOLD, 14));
            button9.addActionListener(e -> button9ActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button2)
                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button7, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(button9, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(button7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
            );
        }

        //---- label2 ----
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setText("what do you want to do?");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(225, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                    .addGap(223, 223, 223))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button9;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
