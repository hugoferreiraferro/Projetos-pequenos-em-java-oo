package entites;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;
	
	public  OutsourcedEmployee () {}

	public OutsourcedEmployee(String name, Integer hours, Double valueForHours, Double additionalCharge) {
		super(name, hours, valueForHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
    @Override
    public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	
	

}
