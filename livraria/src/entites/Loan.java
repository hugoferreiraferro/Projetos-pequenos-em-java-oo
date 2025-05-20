package entites;

import java.time.LocalDate;
import java.util.Date;

public class Loan {
	private Date date;
	private LocalDate localDate;
	
	public Loan() {}

	public Loan(Date date, LocalDate localDate) {
		this.date = date;
		this.localDate = localDate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	
	
	
	
	

}
