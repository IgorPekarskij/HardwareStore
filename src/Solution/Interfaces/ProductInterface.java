package Solution.Interfaces;

public interface ProductInterface {
    int getPrice();

    int getQuantityOfProduct();

    void setQuantityOfProduct(int quantityOfProduct);

    boolean hasGuarantee();

    String getName();

    String getCompany();

    DepartmentInterface getDepartment();
}
