package Solution.Interfaces;

public interface ProductInterface {
    double getPrice();

    boolean hasGuarantee();

    String getName();

    String getCompany();

    DepartmentInterface getDepartment();
}
