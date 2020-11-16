/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package exceptions;

public class InsufficientInformationException extends Exception {
	
	// ----------------------------------------------------------------------------------
	
	// VERSION UID
	
	private static final long serialVersionUID = 1L;
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR

	public InsufficientInformationException() {
		
		super("Informacion insuficiente en el sistema");
		
	}
	
	// ----------------------------------------------------------------------------------

}
