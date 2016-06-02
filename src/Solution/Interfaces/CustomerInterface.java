package Solution.Interfaces;


public interface CustomerInterface {
    String buyProduct(ProductInterface product, int quantity);

    int returnProduct(ProductInterface product, int quantity);

    String getName();

    int getCash();

    void setCash(int money);

    String getHistory();

}
