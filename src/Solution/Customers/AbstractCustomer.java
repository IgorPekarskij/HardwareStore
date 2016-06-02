package Solution.Customers;

import Solution.Interfaces.CustomerInterface;

public abstract class AbstractCustomer implements CustomerInterface{
    private String name;
    private int cash;

    public AbstractCustomer(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void buyProduct() {

    }

    public void returnProduct() {

    }

    @Override
    public int getCash() {
        return cash;
    }
}
