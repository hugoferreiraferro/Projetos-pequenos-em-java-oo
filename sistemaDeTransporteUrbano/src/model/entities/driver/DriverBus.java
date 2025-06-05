package model.entities.driver;

public class DriverBus extends Driver{
	private String line;
	private DriversTypes driversTye;
    
	
	
	public DriverBus() {}
	
	public DriverBus(String name, String registration, String line, DriversTypes driversTye) {
		super(name, registration);
		this.line = line;
		this.driversTye = driversTye;
	}




	public String getLine() {
		return line;
	}




	public void setLine(String line) {
		this.line = line;
	}




	public DriversTypes getDriversTye() {
		return driversTye;
	}




	public void setDriversTye(DriversTypes driversTye) {
		this.driversTye = driversTye;
	}




	@Override
	public String driverDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(getName() + "\n");
		sb.append("Registration: ");
		sb.append(getRegistration() + "\n");
		sb.append("Line: ");
		sb.append(line + "\n");
		sb.append("Type of line: ");
		sb.append(driversTye + "\n");
		return sb.toString();
	}
	

}
