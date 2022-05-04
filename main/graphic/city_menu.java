/*
 * Created by JFormDesigner on Mon Jun 28 23:03:22 IRDT 2021
 */

package main.graphic;

import main.city;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class city_menu extends JFrame {
    public int number=-1;
    public city_menu(city city) {
        initComponents(city);
    }

    private void button1ActionPerformed(ActionEvent e) {
        number = 0;
        this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        number = 1;
        this.dispose();
    }

    private void button3ActionPerformed(ActionEvent e) {
        number = 2;
        this.dispose();
    }

    private void button4ActionPerformed(ActionEvent e) {
        number = 3;
        this.dispose();
    }

    private void button5ActionPerformed(ActionEvent e) {
        number = 4;
        this.dispose();
    }

    private void button6ActionPerformed(ActionEvent e) {
        number = 5;
        this.dispose();
    }

    private void button9ActionPerformed(ActionEvent e) {
        number = 6;
        this.dispose();
    }

    private void button7ActionPerformed(ActionEvent e) {
        number = 7;
        this.dispose();
    }

    private void button8ActionPerformed(ActionEvent e) {
        number = 8;
        this.dispose();
    }

    private void button10ActionPerformed(ActionEvent e) {
        number = 9;
        this.dispose();
    }

    private void button11ActionPerformed(ActionEvent e) {
        number =10;
        this.dispose();
    }

    private void initComponents(city city) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();

        //======== this ========
        setTitle("city menu");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        var contentPane = getContentPane();
        setSize(600,450);
        //---- label1 ----
        label1.setText("welcome to your city");
        label1.setFont(new Font("Arial", Font.BOLD, 16));

        //---- label2 ----
        label2.setText("what do you want to do?");
        label2.setFont(new Font("Arial", Font.BOLD, 16));

        //---- button1 ----
        button1.setText("Build terminal");
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("Buy vehicle");
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("Hire leader");
        button3.setFont(new Font("Arial", Font.BOLD, 12));
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("show information of terminals");
        button4.setFont(new Font("Arial", Font.BOLD, 12));
        button4.addActionListener(e -> button4ActionPerformed(e));

        //---- button5 ----
        button5.setText("build hotel");
        button5.setFont(new Font("Arial", Font.BOLD, 12));
        button5.addActionListener(e -> button5ActionPerformed(e));

        //---- button6 ----
        button6.setText("build room for hotel");
        button6.setFont(new Font("Arial", Font.BOLD, 12));
        button6.addActionListener(e -> button6ActionPerformed(e));

        //---- button7 ----
        button7.setText("add travel");
        button7.setFont(new Font("Arial", Font.BOLD, 12));
        button7.addActionListener(e -> button7ActionPerformed(e));

        //---- button8 ----
        button8.setText("show travels");
        button8.setFont(new Font("Arial", Font.BOLD, 12));
        button8.addActionListener(e -> button8ActionPerformed(e));

        //---- button9 ----
        button9.setText("show information of hotels");
        button9.setFont(new Font("Arial", Font.BOLD, 12));
        button9.addActionListener(e -> button9ActionPerformed(e));

        //---- button10 ----
        button10.setText("bank");
        button10.setFont(new Font("Arial", Font.BOLD, 12));
        button10.addActionListener(e -> button10ActionPerformed(e));

        //---- button11 ----
        button11.setText("exit");
        button11.setFont(new Font("Arial", Font.BOLD, 14));
        button11.addActionListener(e -> button11ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button5)))
                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(button10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(127, 127, 127))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button8))
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
                                    .addGap(16, 16, 16))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(199, 199, 199)
                            .addComponent(label2)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 215, Short.MAX_VALUE)
                            .addComponent(label1)
                            .addGap(216, 216, 216))))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(258, Short.MAX_VALUE)
                    .addComponent(button11, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addGap(233, 233, 233))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button10, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button11, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
