package model.services;

import java.time.LocalDateTime;

public class BikeTransport implements MeansOfTransport {

	@Override
	public LocalDateTime startTrip(int kms) {
		LocalDateTime ltd = LocalDateTime.now();
		return ltd;

	}

	@Override
	public LocalDateTime endTrip(int kms) {
		LocalDateTime ltd = LocalDateTime.now();
		double durationHours = kms / 10;
		int hours = (int) durationHours;
		LocalDateTime arrivalTime = ltd.plusHours(hours);
		return arrivalTime;

	}

	@Override
	public double calculateCosts(int passagem) {
		return 0.50 * passagem;
	}
	
	public double calculateTotal(double distancia) {
		return distancia * 0.50;
	}
}