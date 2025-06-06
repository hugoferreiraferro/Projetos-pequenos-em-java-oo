package model.services;

import java.time.LocalDateTime;

public class BusTransport implements MeansOfTransport {
	LocalDateTime ldt;
	LocalDateTime ltdPlus;

	@Override
	public LocalDateTime startTrip(int kms) {
		ldt = LocalDateTime.now();
		return ldt;

	}

	@Override
	public LocalDateTime endTrip(int kms) {
		double durationHours = kms / 15;
		int hours = (int) durationHours;
		LocalDateTime arrivalTime = ldt.plusHours(hours);
		return arrivalTime;
	}

	@Override
	public double calculateCosts(int passagem) {
		return passagem * 4.50;
	}

}
