/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package model;

public class Controller {
	
	// ----------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE CONTROLLER
	
	private Company company;
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE CONTROLLER
	
	public Controller(Company company) {
		
		this.company = company;
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE CONTROLLER

	public Company getCompany() {
		return company;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE CONTROLLER

	public void setCompany(Company company) {
		this.company = company;
	}
	
	// ----------------------------------------------------------------------------------

}
