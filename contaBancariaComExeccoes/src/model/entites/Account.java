package model.entites;

import model.execptions.DomainExecption;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		if (balance < 0) {
			throw new DomainExecption("Your initial deposit cannot be less than 0");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double ammount) {
		balance += ammount;
	}

	public void withdraw(Double ammount) {
		if (withdrawLimit < ammount) {
			throw new DomainExecption("Amount exceeds withdrawal limit");
		} else if (balance == 0) {
			throw new DomainExecption("you have no balance in your account");
		} else if (balance - ammount < 0) {
			throw new DomainExecption("You do not have enough money to withdraw this amount.");
		}

		balance -= ammount;
	}

}
