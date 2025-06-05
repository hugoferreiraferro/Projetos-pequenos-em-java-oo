package model.services;

import java.time.LocalDateTime;

public class Subway implements MeansOfTransport{

	@Override
	public void startTrip(int kms) {
		LocalDateTime ltd;
		ltd = LocalDateTime.now();
		
	}

	@Override
	public void endTrip(int kms) {
		LocalDateTime ltd;
		ltd = LocalDateTime.now();
		double durationHours = kms / 40;
		int hours = (int) durationHours;
		LocalDateTime arrivalTime = ltd.plusHours(hours);
		
	}

	@Override
	public double calculateCosts(int passagem) {
		return passagem * 7.50;
	}

}
