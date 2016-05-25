package Product;

public class TV {
    private String firma;
    private String model;
    private String department;

    public TV(String firma, String model, String department) {
        this.firma = firma;
        this.model = model;
        this.department = department;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void turnOnTv() {

    }

    public void turnOfTv() {

    }

    public void showChanel(int number) {

    }
}
