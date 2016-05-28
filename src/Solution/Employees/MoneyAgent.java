package Solution.Employees;

import Solution.Bank.Bank;
import Solution.Employees.Employee;

public class MoneyAgent extends Employee{
    private double expirience;
    private Bank bank;

    public MoneyAgent(String name, double expirience, Bank bank) {
        super(name);
        this.expirience = expirience;
        this.bank = bank;
    }

    public double getExpirience() {
        return expirience;
    }

    public void setExpirience(double expirience) {
        this.expirience = expirience;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void sendRequest(){

    }
}
