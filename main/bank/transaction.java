package main.bank;

public class transaction {
    public double money;
    public int time;

    public enum type {
        interest, deposit, withdraw
    }

    public  String type;

    public transaction(double money, String type) {
        this.money = money;
        this.type = type;
    }

}
