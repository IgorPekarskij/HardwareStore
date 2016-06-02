package Solution.Interfaces;


public interface BankInterface {
    boolean checkInfo(String info);

    int giveCredit(int amount, CustomerInterface customer, ProductInterface productList);

    String getName();

    String getCreditDescription();

}
