package model.services;

import java.time.LocalDateTime;

public class Subway implements MeansOfTransport{

	@Override
	public LocalDateTime startTrip(int kms) {
		LocalDateTime ltd;
		ltd = LocalDateTime.now();
		return ltd;
		
	}

	@Override
	public LocalDateTime endTrip(int kms) {
		LocalDateTime ltd;
		ltd = LocalDateTime.now();
		double durationHours = kms / 40;
		int hours = (int) durationHours;
		LocalDateTime arrivalTime = ltd.plusHours(hours);
		return ltd;
		
	}

	@Override
	public double calculateCosts(int passagem) {
		return passagem * 7.50;
	}

}
