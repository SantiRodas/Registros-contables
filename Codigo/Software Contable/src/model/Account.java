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

public class Account {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE ACCOUNT
	
	private String code;
	
	private String name;
	
	private String group;
	
	private ArrayList<Transaction> transactions;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE ACCOUNT
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGroup() {
		return group;
	}
	
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE ACCOUNT
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE ACCOUNT
	
	public Account(String code, String name, String group) {
		
		this.code = code;
		
		this.name = name;
		
		this.group = group;
		
		transactions = new ArrayList<>();
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR REGISTRO A UNA CUENTA SELECCIONADA
	
	public boolean agregarRegistro(Transaction transaction) throws InformationExistsException {
		
		for(int i = 0 ; i < transactions.size() ; i ++) {
			
			if(transactions.get(i).getNumeroRegistro().equalsIgnoreCase(transaction.getNumeroRegistro()) ||
			transactions.get(i).getNombre().equalsIgnoreCase(transaction.getNombre())) {
				
				throw new InformationExistsException();
				
			} 
			
		}
		
		transactions.add(transaction);
		
		return true;
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// TO STRING METHOD

	@Override
	public String toString() {
		
		return  group + " - " + code + " : " + name;
		
	}
	
	// ----------------------------------------------------------------------------------
	
}
