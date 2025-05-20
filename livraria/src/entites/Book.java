package entites;

import java.time.LocalDate;

import entites.enums.Gender;

public class Book {
	LocalDate day = LocalDate.now();
	private String title;
	private String author;
	private Gender gender;
	private Integer numberForPages;
	private Integer quantity;
	
	private Read read;
	
	

	public Book(Gender gender, Integer quantity, Read read) {
		this.gender = gender;
		this.quantity = quantity;
		this.read = read;
	}

	public Book(String title, String author, Gender gender, Integer numberForPages) {
		super();
		this.title = title;
		this.author = author;
		this.gender = gender;
		this.numberForPages = numberForPages;
	}

	public Book(String title, String author, Gender gender, Integer numberForPages, Read read, Integer quantity) {
		this.title = title;
		this.author = author;
		this.gender = gender;
		this.numberForPages = numberForPages;
		this.read = read;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Integer getNumberForPages() {
		return numberForPages;
	}

	public void setNumberForPages(Integer numberForPages) {
		this.numberForPages = numberForPages;
	}


	public Read getRead() {
		return read;
	}

	public void setRead(Read read) {
		this.read = read;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	public Double totalPrice() {	
		return 80.00 * quantity;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(read.getName() + "\n");
		sb.append("Email: ");
		sb.append(read.getName() + "\n");
		sb.append("CPF: ");
		sb.append(read.getCpf() + "\n");
		sb.append("Gender: ");
		sb.append(gender + "\n");
		if(gender == Gender.ADVENTURE) { //quando comparar um enum do tipo enum chamar pela classe e não pelo nome do objeto
			sb.append("Title: ");
			sb.append("The adventures of roberto"  + "\n");
		}
		else if(gender == Gender.HORROR) {
			sb.append("Title: ");
			sb.append("Couscous Ghost"  + "\n");
		}
		
		else if(gender == Gender.FICTION) {
			sb.append("Title: ");
			sb.append("Alien invasion of Barra da Tijuca: The awakening of the Doom of Tijuca" + "\n");
		}
		sb.append("Price total: ");
		sb.append(String.format("%.2f", totalPrice()) + "\n");
		sb.append("data da retirada do livro: " + day);
		return sb.toString();
	}

}
