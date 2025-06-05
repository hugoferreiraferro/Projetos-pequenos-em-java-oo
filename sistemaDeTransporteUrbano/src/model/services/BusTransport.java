package model.services;

import java.time.LocalDateTime;

public class BusTransport implements MeansOfTransport {
	LocalDateTime ldt;
	LocalDateTime ltdPlus;

	@Override
	public void startTrip(int kms) {
		ldt = LocalDateTime.now();

	}

	@Override
	public void endTrip(int kms) {
		double durationHours = kms / 15;
		int hours = (int) durationHours;
		LocalDateTime arrivalTime = ldt.plusHours(hours);
	}

	@Override
	public double calculateCosts(int passagem) {
		return passagem * 4.50;
	}

}
