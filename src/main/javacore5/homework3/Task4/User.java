package main.javacore5.homework3.Task4;

public class User {
	
	private String name;
	private int balance;
	private int monthsOfEmployment;
	private String companyName;
	private int salary;
	private String currency;

	public User(String name, int balance, int monthOfEmployment,
				String companyName, int salary, String currency) {
		this.name = name;
		this.balance = balance;
		this.monthsOfEmployment = monthOfEmployment;
		this.companyName = companyName;
		this.salary = salary;
		this.currency = currency;
	}
	
	public void paySalary() {
		this.balance += this.salary;
	}
	
	public double withdraw(int summ) {
		if (summ < 1000) {
			return balance - summ + (summ*0.05);
		} else {
			return balance - summ + (summ*0.1);
		}
	}
	
	public int companyNameLength(String companyName) {
		return this.companyName.length();
	}
	
	public void monthsIncreaser(int addMonth) {
		monthsOfEmployment += addMonth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMonthOfEmployment() {
		return monthsOfEmployment;
	}

	public void setMonthOfEmployment(int monthOfEmployment) {
		this.monthsOfEmployment = monthOfEmployment;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
