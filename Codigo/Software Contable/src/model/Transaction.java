package model;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {
	
	private Date date;
	private String description;
	private ArrayList <Account> accounts;
	private ArrayList<Double> values;
	private ThirdParty thirdParty;
	public Date getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public ArrayList<Double> getValues() {
		return values;
	}
	public ThirdParty getThirdParty() {
		return thirdParty;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public void setValues(ArrayList<Double> values) {
		this.values = values;
	}
	public void setThirdParty(ThirdParty thirdParty) {
		this.thirdParty = thirdParty;
	}
	public Transaction(Date date, String description, ArrayList<Account> accounts, ArrayList<Double> values,
			ThirdParty thirdParty) {
		super();
		this.date = date;
		this.description = description;
		this.accounts = accounts;
		this.values = values;
		this.thirdParty = thirdParty;
	}
	
	

}
