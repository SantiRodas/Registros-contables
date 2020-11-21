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
	
	private String name;
	
	private String code;
	
	private String phone;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE THIRD PARTY
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE THIRD PARTY
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE THIRD PARTY
	
	public ThirdParty(String name, String code, String phone) {
		
		this.name = name;

		this.code = code;
		
		this.phone = phone;
	
	}
	
	// ----------------------------------------------------------------------------------
	
	// TO STRING METHOD

	@Override
	public String toString() {
		
		return code +" : " + name;
		
	}
	
	// ----------------------------------------------------------------------------------
	
}
