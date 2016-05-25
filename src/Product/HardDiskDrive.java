package Product;

public class HardDiskDrive {
    private String firma;
    private String amountOfMemmory;
    private String department;

    public HardDiskDrive(String firma, String amountOfMemmory, String department) {
        this.firma = firma;
        this.amountOfMemmory = amountOfMemmory;
        this.department = department;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getAmountOfMemmory() {
        return amountOfMemmory;
    }

    public void setAmountOfMemmory(String amountOfMemmory) {
        this.amountOfMemmory = amountOfMemmory;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void formatHDD(){

    }

    public void copyHDD(String from, String to){

    }

    public void deleteFromHDD(String info){

    }
}
