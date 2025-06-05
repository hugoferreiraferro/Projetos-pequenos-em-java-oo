package model.services;

import java.time.LocalDateTime;

public class BikeTransport implements MeansOfTransport {

	@Override
	public void startTrip(int kms) {
		LocalDateTime ltd = LocalDateTime.now();

	}

	@Override
	public void endTrip(int kms) {
		LocalDateTime ltd = LocalDateTime.now();
		double durationHours = kms / 10;
		int hours = (int) durationHours;
		LocalDateTime arrivalTime = ltd.plusHours(hours);

	}

	@Override
	public double calculateCosts(int passagem) {
		return 0.50 * passagem;
	}
	
	public double calculateTotal(double distancia) {
		return distancia * 0.50;
	}
}