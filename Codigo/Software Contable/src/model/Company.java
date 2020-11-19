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

import exceptions.InformationExistsException;

public class Company {

	// ----------------------------------------------------------------------------------

	// ATRIBUTOS Y RELACIONES DE LA CLASE COMPANY

	private String NIT;

	private String name;

	private String Address;

	private String phoneNumber;

	private String kindCompany;

	private ArrayList<Transaction> transactions;

	private ArrayList<Account> accounts;

	private ArrayList<ThirdParty> thirdPeople;

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

	public String getKindCompany() {
		return kindCompany;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public ArrayList<ThirdParty> getThirdPeople() {
		return thirdPeople;
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

	public void setKindCompany(String kindCompany) {
		this.kindCompany = kindCompany;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public void setThirdPeople(ArrayList<ThirdParty> thirdPeople) {
		this.thirdPeople = thirdPeople;
	}

	// ----------------------------------------------------------------------------------

	// METODO CONSTRUCTOR DE LA CLASE COMPANY

	public Company(String nit, String name, String address, String phoneNumber, String kindCompany) {

		this.NIT = nit;

		this.name = name;

		this.Address = address;

		this.phoneNumber = phoneNumber;

		this.kindCompany = kindCompany;

		transactions = new ArrayList<>();

		accounts = new ArrayList<Account>();

		thirdPeople = new ArrayList<ThirdParty>();

	}

	// ----------------------------------------------------------------------------------

	// METODO PARA AGREGAR UNA CUENTA A LA COMPAÑIA

	public boolean agregarCuenta(String codigo, String nombre, String grupo ) throws InformationExistsException {

		for(int i = 0 ; i < accounts.size() ; i ++) {

			if(codigo.equalsIgnoreCase(accounts.get(i).getCode()) ||
			nombre.equalsIgnoreCase(accounts.get(i).getName())) {
				
				throw new InformationExistsException();
				
			}

		}

		accounts.add(new Account(codigo, nombre, grupo));

		return true;

	}

	// ----------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR UNA TERCERA PERSONA AL SISTEMA
	
	public boolean agregarPersona(String codigo, String nombre, String telefono) throws InformationExistsException {
		
		for(int i = 0 ; i < thirdPeople.size() ; i ++) {
			
			if(codigo.equalsIgnoreCase(thirdPeople.get(i).getCode())) {
				
				throw new InformationExistsException();
				
			}
			
		}
		
		thirdPeople.add(new ThirdParty(nombre, codigo, telefono));
		
		return true;
		
	}
	
	// ----------------------------------------------------------------------------------

}
