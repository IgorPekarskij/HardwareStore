package Solution.Products;

import Solution.Department.Computers;

public class HardDiskDrive extends Product{
    private String amountOfMemmory;
    private Computers computers;

    public HardDiskDrive(String name, Computers computers, String amountOfMemmory) {
        super(name);
        this.amountOfMemmory = amountOfMemmory;
        this.computers = computers;
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
