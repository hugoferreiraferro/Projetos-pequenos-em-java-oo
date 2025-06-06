package model.entities.driver;

public class DriveSubway extends Driver {
	private String stations;

	public DriveSubway() {
	}

	public DriveSubway(String name, String registration, String stations) {
		super(name, registration);
		this.stations = stations;
	}
	
	

	public String getStations() {
		return stations;
	}

	public void setStations(String stations) {
		this.stations = stations;
	}

	@Override
	public String driverDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(getName() + "\n");
		sb.append("Registration: ");
		sb.append(getRegistration( ) + "\n");
		sb.append("Rote: ");
		sb.append(stations + "\n");
		return sb.toString();
	}

}
