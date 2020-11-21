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

public class Transaction {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS Y RELACIONES DE LA CLASE TRANSACTION
	
	private String numeroRegistro;
	
	private String nombre;
	
	private ArrayList<Account> cuentas;

	private ArrayList<Double> valoresCuentas; 
	
	private ThirdParty thirdParty;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE TRANSACTION
	
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ThirdParty getThirdParty() {
		return thirdParty;
	}
	
	public ArrayList<Account> getCuentas() {
		return cuentas;
	}
	
	public ArrayList<Double> getValoresCuentas() {
		return valoresCuentas;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE TRANSACTION
	
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setThirdParty(ThirdParty thirdParty) {
		this.thirdParty = thirdParty;
	}
	
	public void setCuentas(ArrayList<Account> cuentas) {
		this.cuentas = cuentas;
	}

	public void setValoresCuentas(ArrayList<Double> valoresCuentas) {
		this.valoresCuentas = valoresCuentas;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONTRUCTOR DE LA CLASE TRANSACTION
	
	public Transaction(String numeroRegistro, String nombre, ArrayList<Account> cuentas, ArrayList<Double> valoresCuentas ,ThirdParty thirdParty) {
		
		this.numeroRegistro = numeroRegistro;
		
		this.nombre = nombre;
		
		this.thirdParty = thirdParty;
		
		cuentas = new ArrayList<Account>();
		
		valoresCuentas = new ArrayList<>();

	}
	
	// ----------------------------------------------------------------------------------

}
