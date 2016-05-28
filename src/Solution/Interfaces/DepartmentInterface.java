package Solution.Interfaces;


import java.util.ArrayList;

public interface DepartmentInterface {
    String getName();

    ArrayList<EmployeeInterface> getEmployeeList();

    ArrayList<ProductInterface> getProductList();
}
