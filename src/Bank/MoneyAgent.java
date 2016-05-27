package Bank;

public class MoneyAgent extends Bank{
    private double expirience;
    private String bank;

    public MoneyAgent(String name, double expirience, String bank) {
        super(name);
        this.expirience = expirience;
        this.bank = bank;
    }

    public double getExpirience() {
        return expirience;
    }

    public void setExpirience(double expirience) {
        this.expirience = expirience;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void sendRequest(){

    }
}
