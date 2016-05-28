package Solution.Customers;

import Solution.SalesRoom;

public class VipCustomer extends BaseCustomer {
    private int discount;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public void buyProduct() {
        if (!checkDiscount()){
            buyProduct();
        } else {
            // купить со скидкой
        }
    }

    boolean checkDiscount() {
        return discount > 0;
    }
}
