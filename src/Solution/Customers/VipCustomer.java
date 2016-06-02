package Solution.Customers;

import Solution.Interfaces.ProductInterface;

public class VipCustomer extends AbstractCustomer {
    private int discount;

    public VipCustomer(String name, int cash, String history, int discount) {
        super(name, cash, history);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

//    @Override
//    public void buyProduct() {
//        if (!checkDiscount()){
//            buyProduct();
//        } else {
//            // купить со скидкой
//        }
//    }


    @Override
    public String buyProduct(ProductInterface product, int quantity) {
        return null;
    }

    @Override
    public int returnProduct(ProductInterface product, int quantity) {
        return 0;
    }

    boolean checkDiscount() {
        return discount > 0;
    }
}
