package Solution.Bank;

import Solution.Interfaces.BankInterface;

public class BaseBank implements BankInterface{
    private String name;
    private String creditDescription;


    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
