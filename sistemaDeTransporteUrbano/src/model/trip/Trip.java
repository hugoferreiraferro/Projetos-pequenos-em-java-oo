package model.trip;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.entities.driver.Driver;
import model.services.MeansOfTransport;

public class Trip {
	private MeansOfTransport transport;
	private List<Driver> driver = new ArrayList<Driver>();
	private Double KMs;
	public Trip() {
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
		sb.append(false);
		return sb.toString();
	}

}
