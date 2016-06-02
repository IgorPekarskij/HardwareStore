package Solution.Bank;


import Solution.Interfaces.CustomerInterface;
import Solution.Interfaces.ProductInterface;

public class AlfaBank extends AbstractBank {

    public AlfaBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public int giveCredit(int amount, CustomerInterface customer, ProductInterface product) {
        if(product.getPrice() > customer.getCash()) {
            if (checkInfo(customer.getHistory())){
                return (product.getPrice() - customer.getCash());
            }
        }
        return 0;
    }
}
