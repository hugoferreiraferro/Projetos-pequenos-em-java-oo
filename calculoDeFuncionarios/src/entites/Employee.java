package entites;

public class Employee {
	private String name;
	private Integer hours;
    private Double valueForHours;
    
    public Employee() {
    	super ();
    }
    
	public Employee(String name, Integer hours, Double valueForHours) {
		this.name = name;
		this.hours = hours;
		this.valueForHours = valueForHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueForHours() {
		return valueForHours;
	}

	public void setValueForHours(Double valueForHours) {
		this.valueForHours = valueForHours;
	}
	
	public Double payment() {
		return hours * valueForHours;
	}
	
	
	
    
    

}
