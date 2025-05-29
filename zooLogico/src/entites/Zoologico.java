package entites;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	public Zoologico () {}
	
	List<Animal> animais = new ArrayList<Animal>();

	public void adicionarAnimais (Animal animal) {
		animais.add(animal);
	}
	
	

}
