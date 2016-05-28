package Solution.Products;

import Solution.Department.Computers;

public class PC extends Product {
    private Computers computers;

    public PC(String name, Computers computers, int ram) {
        super(name, ram);
        this.computers = computers;
    }


    @Override
    public void turnOn(){
        super.turnOn();
    }

    @Override
    public void turnOff(){
        super.turnOff();
    }

    public void loadOperationSystem(String operationSystem) {

    }
}
