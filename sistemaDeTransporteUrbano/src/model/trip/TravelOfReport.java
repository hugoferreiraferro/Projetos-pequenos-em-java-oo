package model.trip;

import java.time.LocalDateTime;

public class TravelOfReport {
	private LocalDateTime now;
	private LocalDateTime arrivalForecast;
	private Double priceTotal;
	
	
	public TravelOfReport() {}

	
	public TravelOfReport(LocalDateTime now, LocalDateTime arrivalForecast, Double priceTotal) {
		super();
		this.now = now;
		this.arrivalForecast = arrivalForecast;
		this.priceTotal = priceTotal;
	}

	public LocalDateTime getNow() {
		return now;
	}

	public void setNow(LocalDateTime now) {
		this.now = now;
	}

	public LocalDateTime getArrivalForecast() {
		return arrivalForecast;
	}

	public void setArrivalForecast(LocalDateTime arrivalForecast) {
		this.arrivalForecast = arrivalForecast;
	}

	public Double getPriceTotal() {
		return priceTotal;
	}
	
	

	
	
	

}
