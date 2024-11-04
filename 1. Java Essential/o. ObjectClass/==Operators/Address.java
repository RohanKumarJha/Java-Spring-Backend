class Address {
	
	private String doorNo;
	private String street;

	public Address(String doorNo, String street) {
		this.doorNo = doorNo;
		this.street = street;
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

    @Override
	public boolean equals(Object address) {
		Address otherAddress=(Address) address;
		if(this.doorNo.equals(otherAddress.doorNo) && this.street.equals(otherAddress.street))
			return true;
		return false;
	} 
   
    @Override
	public int hashCode() {
		return 1+doorNo.hashCode()+street.hashCode();
	}

}
