package model.entities.veiculos;

public class Bus extends Veiculos{
	private String line;
	private String hasIrConditioning;
	
	public Bus() {}

	public Bus(String id, String modelo, Integer capacidade, String line, String hasIrConditioning) {
		super(id, modelo, capacidade);
		this.line = line;
		this.hasIrConditioning = hasIrConditioning;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getHasIrConditioning() {
		return hasIrConditioning;
	}

	public void setHasIrConditioning(String hasIrConditioning) {
		this.hasIrConditioning = hasIrConditioning;
	}
	
	

}
