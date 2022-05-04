/*
 * Created by JFormDesigner on Wed Jun 30 17:13:45 IRDT 2021
 */

package main.graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author srdfgb
 */
public class train_station1 extends JFrame {
    public String work = null;
    public int  area, input, output;
    public String terminal_name, address;
    public train_station1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        work = "ok";
        input = (int) spinner1.getValue();
        output = (int) spinner2.getValue();
        terminal_name = textField1.getText();
        address = textField4.getText();
        area = Integer.parseInt(textField5.getText());
        this.dispose();
    }

    private void button2ActionPerformed(ActionEvent e) {
        work ="cancel";
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        spinner1 = new JSpinner();
        spinner2 = new JSpinner();

        //======== this ========
        setVisible(true);
        setResizable(false);
        setTitle("train station");
        var contentPane = getContentPane();
        setSize(495,470);
        //---- label1 ----
        label1.setText("input rails:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label2 ----
        label2.setText("output rails:");
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
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label2)
                                        .addComponent(label1))
                                    .addGap(34, 34, 34))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label4)
                                        .addComponent(label3)
                                        .addComponent(label5))
                                    .addGap(18, 18, 18)))
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(spinner2, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(spinner1, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(113, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(spinner1))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(spinner2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
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
    private JTextField textField1;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;
    private JButton button2;
    private JSpinner spinner1;
    private JSpinner spinner2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
