package model.entities.veiculos;

public class Subway extends Veiculos{
	private Integer numberOfWagons;
	private String wagonLine;
	
	public Subway () {}

	public Subway(String id, String modelo, Integer capacidade, Integer numberOfWagons, String wagonLine) {
		super(id, modelo, capacidade);
		this.numberOfWagons = numberOfWagons;
		this.wagonLine = wagonLine;
	}

	public Integer getNumberOfWagons() {
		return numberOfWagons;
	}

	public void setNumberOfWagons(Integer numberOfWagons) {
		this.numberOfWagons = numberOfWagons;
	}

	public String getWagonLine() {
		return wagonLine;
	}

	public void setWagonLine(String wagonLine) {
		this.wagonLine = wagonLine;
	}
	
	

}
