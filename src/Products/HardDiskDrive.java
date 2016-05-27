package Products;

public class HardDiskDrive extends Product{
    private String amountOfMemmory;

    public HardDiskDrive(String name, String department, String amountOfMemmory) {
        super(name, department);
        this.amountOfMemmory = amountOfMemmory;
    }

    public String getAmountOfMemmory() {
        return amountOfMemmory;
    }

    public void setAmountOfMemmory(String amountOfMemmory) {
        this.amountOfMemmory = amountOfMemmory;
    }

   public void formatHDD(){

    }

    public void copyHDD(String from, String to){

    }

    public void deleteFromHDD(String info){

    }
}
