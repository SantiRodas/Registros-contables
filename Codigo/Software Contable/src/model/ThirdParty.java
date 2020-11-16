/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package model;

public class ThirdParty {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE THIRD PARTY
	
	private String code;
	
	private String name;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE THIRD PARTY
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE THIRD PARTY
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE THIRD PARTY
	
	public ThirdParty(String code, String name) {

		this.code = code;
		
		this.name = name;
	
	}
	
	// ----------------------------------------------------------------------------------

}
