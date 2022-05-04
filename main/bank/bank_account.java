package main.bank;
import main.*;
import main.country;
import main.person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class bank_account implements Runnable {
    public ArrayList<transaction> transactions = new ArrayList<>();
    public String bank_name;
    public double balance;
    public int password, left_time;
    public person person;
    public String user_name;

    public bank_account(double balance, String user_name, int password, person person, String bank_name) {
        this.balance = balance;
        this.password = password;
        this.person = person;
        this.user_name = user_name;
        this.bank_name = bank_name;
    }
static Object objlock = new Object();
    @Override
    public void run() {
        synchronized(objlock)  {
            TimerTask increaseTemperature = new TimerTask() {

                public void run() {
                    transaction a = new transaction(balance * 1.18, "interest");
                    balance *= 1.18;
                    transactions.add(a);
                    if (main.flag) {
                        JOptionPane.showMessageDialog(new JDialog(),"bank name: " + bank_name +"\n" +"user name: " + user_name +"\n"+ "type: " + a.type +"\n"+ "money: " + a.money);
                        System.out.println();
                    }

                }
            };

            Timer increaserTimer = new Timer("MyTimer");
            increaserTimer.scheduleAtFixedRate(increaseTemperature, 60000, 60000);
        }
    }
}
