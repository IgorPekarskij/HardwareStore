package Products;

public class PC extends Product {

    public PC(String name, String department, int ram) {
        super(name, department, ram);
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
