package model.entities.veiculos;

public abstract class Veiculos {
	private String id;
	private String modelo;
	private Integer capacidade;
	
	public Veiculos() {}

	public Veiculos(String id, String modelo, Integer capacidade) {
		this.id = id;
		this.modelo = modelo;
		this.capacidade = capacidade;
	}

	public String getId() {
		return id;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	
	
	
	

}
