public class Address {
    private String doorNo;
	private String street;

    public Address(String doorNo,String street) {
        this.doorNo = doorNo;
        this.street = street;
    }

    @Override
    public String toString() {
        return this.doorNo+", "+this.street;
    }

    public String getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
}