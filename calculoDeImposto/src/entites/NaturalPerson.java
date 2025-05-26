package entites;

public class NaturalPerson extends Person {
	private Double healthcareExpenses;
	
	public NaturalPerson() {}

	public NaturalPerson(String name, Double annualIncome, Double healthcareExpenses) {
		super(name, annualIncome);
		this.healthcareExpenses = healthcareExpenses;
	}

	public Double getHealthcareExpenses() {
		return healthcareExpenses;
	}

	public void setHealthcareExpenses(Double healthcareExpenses) {
		this.healthcareExpenses = healthcareExpenses;
	}
	
	@Override
	public double tax ( ){
		double basicTax;
		if(getAnnualIncome() < 20000.00) {
			basicTax = (getAnnualIncome() * 0.25);
		}
		else {
			basicTax = (getAnnualIncome() * 0.15);
		}
		basicTax -= healthcareExpenses * 0.5;
		if (basicTax <0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

}
