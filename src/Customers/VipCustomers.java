package Customers;

public class VipCustomers extends Customer{
    private int discount;

    public VipCustomers(String name, int discount) {
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
