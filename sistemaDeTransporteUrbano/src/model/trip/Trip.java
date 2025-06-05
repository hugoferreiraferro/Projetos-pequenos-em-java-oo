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
	private LocalDate startTime;
	private LocalDate endTime;

	public Trip() {
	}

	public Trip(MeansOfTransport transport, Double kMs, LocalDate startTime, LocalDate endTime) {
		this.transport = transport;
		KMs = kMs;
		this.startTime = startTime;
		this.endTime = endTime;
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

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
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
