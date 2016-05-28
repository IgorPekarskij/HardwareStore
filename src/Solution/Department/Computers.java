package Solution.Department;

import Solution.Consultant;
import Solution.Products.Product;
import Solution.SalesRoom;

public class Computers extends Department {

    public Computers(String name, Product products, SalesRoom salesRoom, Consultant consultant) {
        super(name, products, salesRoom, consultant);
    }
}
