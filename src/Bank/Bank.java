package Bank;

public class Bank {
    private String name;
    private String creditTerms;

    public Bank(String name, String creditTerms) {
        this.name = name;
        this.creditTerms = creditTerms;
    }

    public Bank(String name) {
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
