package Solution.Department;

import Solution.Products.BaseProduct;
import java.util.ArrayList;

public class BaseDepartment {
    private String name;
    private ArrayList<BaseProduct> baseProducts; // Not implemented
    private ArrayList<BaseDepartment> baseDepartments; // Not implemented

    public BaseDepartment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
