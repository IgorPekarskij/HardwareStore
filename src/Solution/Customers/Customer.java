package Solution.Customers;

import Solution.SalesRoom;

public class Customer {
    private String name;
    private SalesRoom salesRoom;

    public Customer(String name, SalesRoom salesRoom) {
        this.name = name;
        this.salesRoom = salesRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buyProduct() {

    }

    public void returnProduct() {

    }

}
