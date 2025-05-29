package entites;

public class Ave extends Animal{
	private boolean voa;
	
	public Ave() {}

	public Ave(String nome, Integer idade, Integer id, boolean voa) {
		super(nome, idade, id);
		this.voa = voa;
	}

	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	
	
	
	
	
	

}
