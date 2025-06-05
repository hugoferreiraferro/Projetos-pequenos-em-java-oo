package model.services;

public interface MeansOfTransport {
	void startTrip(int kms);
	
	void endTrip(int kms);
	
	double calculateCosts(int passagem);

}
