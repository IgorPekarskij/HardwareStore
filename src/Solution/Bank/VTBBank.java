package Solution.Bank;


import Solution.Interfaces.CustomerInterface;
import Solution.Interfaces.ProductInterface;

public class VTBBank extends AbstractBank {

    public VTBBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public int giveCredit(int amount, CustomerInterface customer, ProductInterface product) {
        if(!checkInfo(customer.getHistory())){
            return amount;
        }
        return 0;
    }
}
