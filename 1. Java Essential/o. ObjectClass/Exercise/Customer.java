class Customer {
    private int customerId;
    private String name;
    private String phone;
    
    public Customer(int customerId, String name, String phone) {
        //code here
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
    }
    
    public String toString() {
        return customerId+", "+name+", "+phone;        
    }

}
