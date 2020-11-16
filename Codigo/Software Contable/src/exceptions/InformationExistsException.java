/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package exceptions;

public class InformationExistsException extends Exception {
	
	// ----------------------------------------------------------------------------------
	
	// VERSION UID

	private static final long serialVersionUID = 1L;
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR

	public InformationExistsException() {
		
		super("La informacion ya existe en el sistema");
		
	}
	
	// ----------------------------------------------------------------------------------

}
