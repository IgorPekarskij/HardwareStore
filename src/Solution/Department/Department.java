package Solution.Department;

import Solution.Consultant;
import Solution.Products.Product;
import Solution.SalesRoom;

public class Department {
    private String name;
    private Product products;
    private SalesRoom salesRoom;
    private Consultant consultant;

    public Department(String name, Product products, SalesRoom salesRoom, Consultant consultant) {
        this.name = name;
        this.products = products;
        this.salesRoom = salesRoom;
        this.consultant = consultant;
    }

    public Department(String name, Product products) {
        this.name = name;
        this.products = products;
    }

    public Product getProducts() {
        return products;
    }

    public SalesRoom getSalesRoom() {
        return salesRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
