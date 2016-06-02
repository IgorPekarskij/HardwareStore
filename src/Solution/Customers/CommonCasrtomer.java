package Solution.Customers;


import Solution.Interfaces.EmployeeInterface;
import Solution.Interfaces.ProductInterface;

public class CommonCasrtomer extends AbstractCustomer {

    public CommonCasrtomer(String name, int cash, String history) {
        super(name, cash, history);
    }

    @Override
    public String buyProduct(ProductInterface product, int quantity) {
        EmployeeInterface banker;
        if(product.getPrice() < getCash() && quantity < product.getQuantityOfProduct()){
            return "Thank you for your purchase";
        }
        else if(product.getPrice() < getCash() && quantity > product.getQuantityOfProduct()){
            return "Sorry do not have the right amount of product";
        }
        else if(product.getPrice() > getCash() && quantity < product.getQuantityOfProduct()) {
            return null;    // Нужно реализовать покупку через кредит
        }
        return null;
    }

    @Override
    public int returnProduct(ProductInterface product, int quantity) {
        return 0;
    }

}
