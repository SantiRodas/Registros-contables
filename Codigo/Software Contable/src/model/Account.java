/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package model;

public class Account {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE ACCOUNT
	
	private String code;
	
	private String name;
	
	private String group;
	
	private boolean resultAccount;
	
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
	
	public boolean isResultAccount() {
		return resultAccount;
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
	
	public void setResultAccount(boolean resultAccount) {
		this.resultAccount = resultAccount;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE ACCOUNT
	
	public Account(String code, String name, String group, boolean resultAccount) {
		
		this.code = code;
		
		this.name = name;
		
		this.group = group;
		
		this.resultAccount = resultAccount;
		
	}
	
	// ----------------------------------------------------------------------------------

}
