package Solution.Products;

import Solution.Department.HomeElectronics;

public class TV extends Product{
    private String model;
    private HomeElectronics homeElectronics;

    public TV(String name, HomeElectronics homeElectronics, String model) {
        super(name);
        this.model = model;
        this.homeElectronics = homeElectronics;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public void showChanel(int number) {

    }
}
