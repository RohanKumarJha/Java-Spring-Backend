public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private int experience;

    public PermanentEmployee(int employeeId,String name) {
        super(employeeId,name);
    }

    public double getBasicPay() {
        return basicPay;
    }
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

    public void calculateSalary() {
        if(this.experience<3) {
            setSalary((basicPay*0)/100+basicPay+hra);
        } else if(this.experience>=3 && this.experience<5) {
            setSalary((basicPay*5)/100+basicPay+hra);
        } else if(this.experience>=5 && this.experience<10) {
            setSalary((basicPay*7)/100+basicPay+hra);
        } else if(this.experience>=10) {
            setSalary((basicPay*12)/100+basicPay+hra);
        }
    }
}
