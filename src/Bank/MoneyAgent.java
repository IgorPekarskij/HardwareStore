package Bank;

public class MoneyAgent {
    private String name;
    private double expirience;
    private String bank;

    public MoneyAgent(String name, double expirience, String bank) {
        this.name = name;
        this.expirience = expirience;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
