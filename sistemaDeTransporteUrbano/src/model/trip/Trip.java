package model.trip;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.entities.driver.Driver;
import model.services.MeansOfTransport;

public class Trip {
	private DateTimeFormatter fomratter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	private MeansOfTransport transport;
	private List<Driver> driver = new ArrayList<Driver>();
	private Double KMs;
	private List<TravelOfReport> travel = new ArrayList<>();

	public Trip() {
	}

	public List<TravelOfReport> getTravel() {
		return travel;
	}

	public void setDriver(List<Driver> driver) {
		this.driver = driver;
	}

	public Trip(MeansOfTransport transport, Double kMs) {
		this.transport = transport;
		KMs = kMs;

	}

	public MeansOfTransport getTransport() {
		return transport;
	}

	public void setTransport(MeansOfTransport transport) {
		this.transport = transport;
	}

	public List<Driver> getDriver() {
		return driver;
	}

	public Double getKMs() {
		return KMs;
	}

	public void setKMs(Double kMs) {
		KMs = kMs;
	}

	public void addEmployee(Driver drive) {
		driver.add(drive);
	}

	public String generateReport() {
		StringBuilder sb = new StringBuilder();
		for (TravelOfReport t : travel) {
			sb.append("Price total: ");
			sb.append(toString().format("%.2f", t.getPriceTotal()) + "\n");
			sb.append("departure time: ");
			sb.append(t.getNow().format(fomratter) + "\n");
			sb.append("arrival forecast: ");
			sb.append(t.getArrivalForecast().format(fomratter) + "\n");
		}
		return sb.toString();
	}

}
