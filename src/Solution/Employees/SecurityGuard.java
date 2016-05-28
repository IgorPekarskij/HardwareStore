package Solution.Employees;

import Solution.Customers.Customer;
import Solution.SalesRoom;

public class SecurityGuard extends Employee{
    private Customer customer;

    public SecurityGuard(String name, SalesRoom salesRoom, Customer customer) {
        super(name, salesRoom);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void openDoor(){

    }

    public void closeDoor(){

    }

    public void checkCustomer(){

    }
}
