package Customers;

public class VipCustomers {
    private String name;
    private int discount;

    public VipCustomers(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void buyProductWithDiscount(String product, int discount, int countity) {

    }

    public void returnProduct(String product, int countity) {

    }
}
