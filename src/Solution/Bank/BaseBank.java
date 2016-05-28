package Solution.Bank;

public class BaseBank {
    private String name;
    private String creditTerms;

    public BaseBank() {
    }

    public BaseBank(String name, String creditTerms) {
        this.name = name;
        this.creditTerms = creditTerms;
    }

    public BaseBank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditTerms() {
        return creditTerms;
    }

    public void setCreditTerms(String creditTerms) {
        this.creditTerms = creditTerms;
    }

    public void giveCredit(int sum){

    }

    public void checkCreditStory(String customer){

    }

}
