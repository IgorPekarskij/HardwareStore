package Solution.Employees;

import Solution.Bank.BaseBank;
import Solution.SalesRoom;

public class MoneyAgent extends BaseEmployee {
    private double expirience;
    private BaseBank baseBank;

    public MoneyAgent(String name, double expirience, BaseBank baseBank) {
        super(name);
        this.expirience = expirience;
        this.baseBank = baseBank;
    }

    public double getExpirience() {
        return expirience;
    }

    public void setExpirience(double expirience) {
        this.expirience = expirience;
    }

    public BaseBank getBaseBank() {
        return baseBank;
    }

    public void setBaseBank(BaseBank baseBank) {
        this.baseBank = baseBank;
    }

    public void sendRequest(){

    }
}
