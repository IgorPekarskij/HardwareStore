package Solution.Department;

import Solution.Consultant;
import Solution.Products.Product;
import Solution.SalesRoom;

/**
 * Created by Игорь on 28.05.2016.
 */
public class HomeElectronics extends Department {

    public HomeElectronics(String name, Product products, SalesRoom salesRoom, Consultant consultant) {
        super(name, products, salesRoom, consultant);
    }

    public HomeElectronics(String name, Product products) {
        super(name, products);
    }
}
