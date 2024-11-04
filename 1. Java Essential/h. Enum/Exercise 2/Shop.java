class Shop {
	private double amount;
	private Category type;
	private double discount;

	Shop(double amount,Category type){
		this.amount=amount;
		this.type=type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Category getType() {
		return type;
	}
	public void checkDiscountApplicability(double amount,Category type){
        if(Category.MOBILE.equals(type)) {
            if(amount>30000.0) {
                this.applyDiscount(type);
            }
        } else if(Category.TABLET.equals(type)) {
            if(amount>35000.0) {
                this.applyDiscount(type);
            }
        } else if(Category.LAPTOP.equals(type)) {
            if(amount>35000.0) {
                this.applyDiscount(type);
            }
        }  else if(Category.DESKTOP.equals(type)) {
            if(amount>50000.0) {
                this.applyDiscount(type);
            }
        } else {
            System.out.println("Thank you for shopping, your bill amount is: " + (this.getAmount()-(this.getAmount()*7)/100));
        }
	}

	public void applyDiscount(Category type) {
        if(type == Category.MOBILE) {
            System.out.println(("Thank you for shopping, your bill amount is: " + (this.getAmount()-(this.getAmount()*15)/100)));
        } else if(type == Category.TABLET) {
            System.out.println(("Thank you for shopping, your bill amount is: " + (this.getAmount()-(this.getAmount()*10)/100)));
        } else if(type == Category.LAPTOP) {
            System.out.println(("Thank you for shopping, your bill amount is: " + (this.getAmount()-(this.getAmount()*8)/100)));
        } else if(type == Category.DESKTOP) {
            System.out.println(("Thank you for shopping, your bill amount is: " + (this.getAmount()-(this.getAmount()*10)/100)));
        } 
	}

}
