package Solution.Employees;

import Solution.Interfaces.BankInterface;

public class Banker extends AbstractEmployee {
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
