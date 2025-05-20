package entites;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> horror = new ArrayList<Book>();
	private List<Book> fiction = new ArrayList<Book>();
	private List<Book> adventure = new ArrayList<Book>();
	
	private Book book;
	
	public Library() {}

	public Library(List<Book> horror, List<Book> fiction, List<Book> adventure, Book book) {
		this.horror = horror;
		this.fiction = fiction;
		this.adventure = adventure;
		this.book = book;
	}

	public List<Book> getHorror() {
		return horror;
	}

	

	public List<Book> getFiction() {
		return fiction;
	}

	

	public List<Book> getAdventure() {
		return adventure;
	}

	

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	public void addHorror(Book book) {
		horror.add(book);
	}
	
	public void addFiction(Book book) {
		horror.add(book);
	}
	
	public void addAdventure(Book book) {
		horror.add(book);
	}
	
	
	
	

	
	
	
	
	
	
	

}
