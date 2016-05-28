package Solution.Customers;

import Solution.SalesRoom;

public class VipCustomer extends BaseCustomer {
    private int discount;

    public VipCustomer(String name, int discount) {
        super(name);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public void buyProduct() {
        if (!chekDiscount()){
            buyProduct();
        } else {
            // купить со скидкой
        }
    }

    boolean chekDiscount() {
        return discount > 0;
    }
}
