package Customers;

public class VipCustomer extends Customer{
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

    public void buyProductWithDiscount() {

    }

    @Override
    public void returnProduct() {
        super.returnProduct();
    }
}
