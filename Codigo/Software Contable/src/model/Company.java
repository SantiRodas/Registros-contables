/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package model;

import java.util.ArrayList;

public class Company {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS Y RELACIONES DE LA CLASE COMPANY
	
	private String NIT;
	
	private String name;
	
	private String Address;
	
	private String phoneNumber;
	
	private ArrayList<Transaction> transactions;
	
	private ArrayList<Account> accounts;
	
	private ArrayList<ThirdParty> thirdParties;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE COMPANY
	
	public String getNIT() {
		return NIT;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	public ArrayList<ThirdParty> getThirdParties() {
		return thirdParties;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE COMPANY
	
	public void setNIT(String nIT) {
		NIT = nIT;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void setThirdParties(ArrayList<ThirdParty> thirdParties) {
		this.thirdParties = thirdParties;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE COMPANY
	
	public Company(String nIT, String name, String address, String phoneNumber, ArrayList<Transaction> transactions, ArrayList<Account> accounts, ArrayList<ThirdParty> thirdParties) {
		
		NIT = nIT;
		
		this.name = name;
		
		Address = address;
		
		this.phoneNumber = phoneNumber;
		
		this.transactions = transactions;
		
		this.accounts = accounts;
		
		this.thirdParties = thirdParties;
	
	}
	
	// ----------------------------------------------------------------------------------

}
