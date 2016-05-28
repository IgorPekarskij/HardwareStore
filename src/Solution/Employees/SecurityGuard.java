package Solution.Employees;

import Solution.Customers.BaseCustomer;
import Solution.SalesRoom;

public class SecurityGuard extends BaseEmployee {
    private BaseCustomer baseCustomer;

    public SecurityGuard(String name, BaseCustomer baseCustomer) {
        super(name);
        this.baseCustomer = baseCustomer;
    }

    public BaseCustomer getBaseCustomer() {
        return baseCustomer;
    }

    public void openDoor(){

    }

    public void closeDoor(){

    }

    public void checkCustomer(){

    }
}
