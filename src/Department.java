public class Department extends SalesRoom {
    private String products;

    public Department(String name, String products) {
        super(name);
        this.products = products;
    }

    public String getProdacts() {
        return products;
    }

    public void setProdacts(String prodacts) {
        this.products = prodacts;
    }
}
