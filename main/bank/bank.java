package main.bank;

import java.util.ArrayList;

public class bank {
    public ArrayList<bank_account> accounts = new ArrayList<>();
    public String bank_name;
    public int money, active_accounts = accounts.size();

    public bank(String bank_name) {
        this.bank_name = bank_name;

    }
}
