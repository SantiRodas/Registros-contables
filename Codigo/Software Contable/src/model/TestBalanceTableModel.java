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
import java.util.Map;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class TestBalanceTableModel {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE TEST BALANCE TABLE MODEL
	
	private SimpleStringProperty columnaCuenta;

	private SimpleDoubleProperty columnaEntrada;

	private SimpleDoubleProperty columnaSalida;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE TEST BALANCE TABLE MODEL

	public String getColumnaCuenta() {
		return columnaCuenta.get();
	}

	public double getColumnaEntrada() {
		return columnaEntrada.get();
	}

	public double getColumnaSalida() {
		return columnaSalida.get();
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE TEST BALANCE TABLE MODEL

	public void setColumnaCuenta(SimpleStringProperty columnaCuenta) {
		this.columnaCuenta = columnaCuenta;
	}

	public void setColumnaEntrada(SimpleDoubleProperty columnaEntrada) {
		this.columnaEntrada = columnaEntrada;
	}

	public void setColumnaSalida(SimpleDoubleProperty columnaSalida) {
		this.columnaSalida = columnaSalida;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE TEST BALANCE TABLE MODEL

	public TestBalanceTableModel(String columnaCuenta, double columnaEntrada,
	double columnaSalida) {
		
		this.columnaCuenta = new SimpleStringProperty(columnaCuenta);
		
		this.columnaEntrada = new SimpleDoubleProperty(columnaEntrada);
		
		this.columnaSalida = new SimpleDoubleProperty(columnaSalida);
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO FROM MAP
	
	public static ArrayList<TestBalanceTableModel> fromMap(Map<String, double[]> map){
		
		ArrayList<TestBalanceTableModel> list=new ArrayList<TestBalanceTableModel>();
		
		map.forEach((k,v)->{
			
			list.add(new TestBalanceTableModel(k, v[0], v[1]));
			
		});
		
		return list;
		
	}
	
	// ----------------------------------------------------------------------------------

}
