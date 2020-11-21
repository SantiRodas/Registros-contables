/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package exceptions;

public class InsufficientAccountsExcetion extends Exception {
	
	// ----------------------------------------------------------------------------------
	
	// VERSION UID
	
	private static final long serialVersionUID = 1L;
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA EXCEPCION

	public InsufficientAccountsExcetion() {
		
		super("Cantidad de cuentas insuficientes");
		
	}
	
	// ----------------------------------------------------------------------------------

}
