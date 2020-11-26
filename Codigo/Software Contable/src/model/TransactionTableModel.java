/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class TransactionTableModel {

	// ----------------------------------------------------------------------------------

	// ATRIBUTOS DE LA CLASE TRANSACTION TABLE MODEL

	private SimpleStringProperty nrt;

	private SimpleStringProperty nt;

	private SimpleStringProperty c1t;

	private SimpleDoubleProperty v1t;

	private SimpleStringProperty c2t;

	private SimpleDoubleProperty v2t;

	private SimpleStringProperty c3t;

	private SimpleDoubleProperty v3t;

	private SimpleStringProperty tpp;

	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE TRANSACTION TABLE MODEL

	public String getNrt() {
		return nrt.get();
	}
	
	public String getNt() {
		return nt.get();
	}
	
	public String getC1t() {
		return c1t.get();
	}
	
	public double getV1t() {
		return v1t.get();
	}
	
	public String getC2t() {
		return c2t.get();
	}
	
	public double getV2t() {
		return v2t.get();
	}
	
	public String getC3t() {
		return c3t.get();
	}
	
	public double getV3t() {
		return v3t.get();
	}
	
	public String getTpp() {
		return tpp.get();
	}

	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE TRANSACTION TABLE MODEL

	public void setNrt(SimpleStringProperty nrt) {
		this.nrt = nrt;
	}
	
	public void setNt(SimpleStringProperty nt) {
		this.nt = nt;
	}
	
	public void setC1t(SimpleStringProperty c1t) {
		this.c1t = c1t;
	}
	
	public void setV1t(SimpleDoubleProperty v1t) {
		this.v1t = v1t;
	}
	
	public void setC2t(SimpleStringProperty c2t) {
		this.c2t = c2t;
	}
	
	public void setV2t(SimpleDoubleProperty v2t) {
		this.v2t = v2t;
	}
	
	public void setC3t(SimpleStringProperty c3t) {
		this.c3t = c3t;
	}
	
	public void setV3t(SimpleDoubleProperty v3t) {
		this.v3t = v3t;
	}
	
	public void setTpp(SimpleStringProperty tpp) {
		this.tpp = tpp;
	}

	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE TRANSACTION TABLE MODEL

	public TransactionTableModel(String nrt, String nt, String c1t,
	double v1t, String c2t, double v2t, String c3t, double v3t, String tpp) {
		
		this.nrt = new SimpleStringProperty(nrt);
		
		this.nt = new SimpleStringProperty(nt);
		
		this.c1t = new SimpleStringProperty(c1t);
		
		this.v1t = new SimpleDoubleProperty(v1t);
		
		this.c2t = new SimpleStringProperty(c2t);
		
		this.v2t = new SimpleDoubleProperty(v2t);
		
		this.c3t = new SimpleStringProperty(c3t);
		
		this.v3t = new SimpleDoubleProperty(v3t);
		
		this.tpp = new SimpleStringProperty(tpp);
		
	}

	// ----------------------------------------------------------------------------------
	
	// METODO STATIC "FROM TRANSACTION"

	public static TransactionTableModel fromTransaction(Transaction t) {

		return new TransactionTableModel(
				
				(t.getNumeroRegistro()), 
				(t.getNombre()), 
				(t.getCuentas().get(0).getName()),
				(t.getValoresCuentas().get(0)), 
				(t.getCuentas().get(1).getName()),
				(t.getValoresCuentas().get(1)), 
				(t.getCuentas().size()>2?t.getCuentas().get(2).getName():""),
				(t.getValoresCuentas().size()>2?t.getValoresCuentas().get(2):0.0),
				(t.getThirdParty().getName())
				);
		
	}

	// ----------------------------------------------------------------------------------
	
	// METHOD TO STRING

	@Override
	public String toString() {
		
		return "TransactionTableModel [nrt=" + nrt + ", nt=" + nt + ", c1t=" + c1t + ", v1t=" + v1t + ", c2t=" + c2t
		+ ", v2t=" + v2t + ", c3t=" + c3t + ", v3t=" + v3t + ", tpp=" + tpp + "]";
	
	}

	// ----------------------------------------------------------------------------------

}
