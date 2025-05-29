package entites;

public class Mamifero extends Animal{
	private String alimentacao;
	
	public Mamifero () {}

	public Mamifero(String nome, Integer idade, Integer id, String alimentacao) {
		super(nome, idade, id);
		this.alimentacao = alimentacao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	
	

}
