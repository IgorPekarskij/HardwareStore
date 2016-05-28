package Solution.Department;

import Solution.Consultant;
import Solution.Products.Product;
import Solution.SalesRoom;

public class Games extends Department {


    public Games(String name, Product products, SalesRoom salesRoom, Consultant consultant) {
        super(name, products, salesRoom, consultant);
    }

    public Games(String name, Product products) {
        super(name, products);
    }
}
