package Solution.Employees;

import Solution.Bank.BaseBank;
import Solution.Interfaces.BankInterface;

public class Banker extends BaseEmployee {
    private double expirience;
    private BankInterface baseBank;


    public double getExpirience() {
        return expirience;
    }

    public void setExpirience(double expirience) {
        this.expirience = expirience;
    }

    public void sendRequest(){

    }
}
