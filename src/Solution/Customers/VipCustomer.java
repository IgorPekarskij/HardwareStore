package Solution.Customers;

import Solution.SalesRoom;

public class VipCustomer extends BaseCustomer {
    private int discount;

    public VipCustomer(String name, SalesRoom salesRoom, int discount) {
        super(name, salesRoom);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void buyProductWithDiscount() {

    }

    @Override
    public void returnProduct() {
        super.returnProduct();
    }
}
