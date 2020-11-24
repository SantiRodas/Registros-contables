/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package model;

public class AccountSummary {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE ACCOUNT SUMMARY
	
	private String name;
	
	private String group;
	
	private double totalValue;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE ACCOUNT SUMMARY
	
	public String getName() {
		return name;
	}
	
	public String getGroup() {
		return group;
	}
	
	public double getTotalValue() {
		return totalValue;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE ACCOUNT SUMMARY
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CALSE ACCOUNT SUMMARY
	
	public AccountSummary(String name, String group, double totalValue) {
		
		this.name = name;
		
		this.group = group;
		
		this.totalValue = totalValue;
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO ADD TO VALUE
	
	public void addToValue(double add) {
		
		this.totalValue += add;
		
	}
	
	// ----------------------------------------------------------------------------------

}
