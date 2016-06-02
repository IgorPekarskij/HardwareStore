package Solution.Bank;

import Solution.Interfaces.BankInterface;
import Solution.Interfaces.CustomerInterface;
import Solution.Interfaces.ProductInterface;

public abstract class AbstractBank implements BankInterface{
    private String name;
    private String creditDescription;

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    public AbstractBank(String name) {
        this.name = name;
    }

    @Override
    public boolean checkInfo(String info) {
        if(info.length() > 0 && !info.equals("Warning"))
            return true;
        return false;
    }


     abstract public int giveCredit(int amount, CustomerInterface customer, ProductInterface product);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
