package model.trip;

import java.time.LocalDateTime;

import model.services.MeansOfTransport;

public class addData {
	private MeansOfTransport meansOfTransport;
	private TravelOfReport travel;

	
	public addData() {
	}
	
	

	public addData(MeansOfTransport meansOfTransport) {
		super();
		this.meansOfTransport = meansOfTransport;
	}



	public void addingDateToTrip(int kms, int passagem) {
		double totalPrice = meansOfTransport.calculateCosts(passagem);
		LocalDateTime dateInitial = meansOfTransport.startTrip(kms);
		LocalDateTime dateEnd = meansOfTransport.endTrip(kms);

		travel = new TravelOfReport(dateInitial, dateEnd, totalPrice);
	}

}
