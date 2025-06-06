package model.services;

import java.time.LocalDateTime;

public interface MeansOfTransport {
	LocalDateTime startTrip(int kms);
	
	LocalDateTime endTrip(int kms);
	
	double calculateCosts(int passagem);

}
