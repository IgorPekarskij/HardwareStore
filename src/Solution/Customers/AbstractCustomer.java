package Solution.Customers;

import Solution.Interfaces.CustomerInterface;
import Solution.Interfaces.ProductInterface;

public abstract class AbstractCustomer implements CustomerInterface{
    private String name;
    private int cash;
    private String history;

    public AbstractCustomer(String name, int cash, String history) {
        this.name = name;
        this.cash = cash;
        this.history = history;
    }

    public String getName() {
        return name;
    }

    @Override
    abstract public String buyProduct(ProductInterface product, int quantity);

    @Override
    public String getHistory() {
        return history;
    }

    @Override
    public int getCash() {
        return cash;
    }

    @Override
    public void setCash(int cash) {
        this.cash = cash;
    }

}
