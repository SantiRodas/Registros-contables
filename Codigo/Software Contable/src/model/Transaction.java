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
import java.util.Date;

public class Transaction {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS Y RELACIONES DE LA CLASE TRANSACTION
	
	private Date date;
	
	private String description;
	
	private ArrayList <Account> accounts;
	
	private ArrayList<Double> values;
	
	private ThirdParty thirdParty;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE TRANSACTION
	
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
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE TRANSACTION
	
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
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONTRUCTOR DE LA CLASE TRANSACTION
	
	public Transaction(Date date, String description, ArrayList<Account> accounts, ArrayList<Double> values, ThirdParty thirdParty) {

		this.date = date;
		
		this.description = description;
		
		this.accounts = accounts;
		
		this.values = values;
		
		this.thirdParty = thirdParty;
	
	}
	
	// ----------------------------------------------------------------------------------

}
