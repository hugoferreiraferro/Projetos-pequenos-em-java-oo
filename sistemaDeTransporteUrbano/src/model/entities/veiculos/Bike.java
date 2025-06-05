package model.entities.veiculos;

import model.services.MeansOfTransport;

public class Bike {
	private MeansOfTransport transport;

	public Bike(MeansOfTransport transport) {
		this.transport = transport;
	}

	public MeansOfTransport getTransport() {
		return transport;
	}

	public void setTransport(MeansOfTransport transport) {
		this.transport = transport;
	}
	
	
	
	

}
