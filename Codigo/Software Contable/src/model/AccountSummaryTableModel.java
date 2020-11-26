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

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Label;

public class AccountSummaryTableModel {
	
	// ----------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE ACCOUNT SUMMARY TABLE MODEL
	
	private SimpleStringProperty nombre;

	private SimpleStringProperty valor;
	
	// ----------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE ACCOUNT SUMMARY TABLE MODEL

	public String getNombre() {
		return nombre.get();
	}

	public String getValor() {
		return valor.get();
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE ACCOUNT SUMMARY TABLE MODEL

	public void setNombre(SimpleStringProperty nombre) {
		this.nombre = nombre;
	}

	public void setValor(SimpleStringProperty valor) {
		this.valor = valor;
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE ACCOUNT SUMMARY TABLE MODEL

	public AccountSummaryTableModel(String nombre, String valor) {

		this.nombre = new SimpleStringProperty(nombre);
		
		this.valor = new SimpleStringProperty(valor);
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO GENERATE ASSERTS LIST DE LA CLASE ACCOUNT SUMMARY TABLE MODEL
	
	public static ArrayList<AccountSummaryTableModel> generateAssetsList(ArrayList<AccountSummary> assets){
		
		ArrayList<AccountSummaryTableModel> assetsTable=new ArrayList<AccountSummaryTableModel>();
		
		assetsTable.add(new AccountSummaryTableModel("Activos:", ""));
		
		assetsTable.add(new AccountSummaryTableModel("", ""));
		
		for (int i = 0 ; i < assets.size() ; i++) {
			
			if(i == assets.size() -1 ) {
				
				assetsTable.add(new AccountSummaryTableModel("", ""));
				
				assetsTable.add(new AccountSummaryTableModel(assets.get(i).getName(), Math.abs(assets.get(i).getTotalValue()) + ""));
			
			} else {
				
				assetsTable.add(new AccountSummaryTableModel(assets.get(i).getName(), Math.abs(assets.get(i).getTotalValue()) + ""));
			
			}
			
		}
		
		return assetsTable;
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO GENERATE LIABILITIES AND NEWTORTH LIST DE LA CLASE ACCOUNT SUMMARY TABLE MODEL
	
	public static ArrayList<AccountSummaryTableModel> generateLiabilitiesAndNetworthList(ArrayList<AccountSummary> liabilities,ArrayList<AccountSummary> networth){
		
		ArrayList<AccountSummaryTableModel> resultTable = new ArrayList<AccountSummaryTableModel>();
		
		resultTable.add(new AccountSummaryTableModel("Pasivos:", ""));
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		for (int i = 0 ; i < liabilities.size() ; i++) {
			
			if(i == liabilities.size() -1) {
				
				resultTable.add(new AccountSummaryTableModel("", ""));
				
				resultTable.add(new AccountSummaryTableModel(liabilities.get(i).getName(), Math.abs(liabilities.get(i).getTotalValue()) + ""));
			
			} else {
				
				resultTable.add(new AccountSummaryTableModel(liabilities.get(i).getName(), Math.abs(liabilities.get(i).getTotalValue()) + ""));
			
			}
			
		}
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		resultTable.add(new AccountSummaryTableModel("Patrimonio:", ""));
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		for (int i = 0 ; i < networth.size() ; i++) {
			
			if(i == networth.size() -1 ) {
				
				resultTable.add(new AccountSummaryTableModel("", ""));
				
				resultTable.add(new AccountSummaryTableModel(networth.get(i).getName(), Math.abs(networth.get(i).getTotalValue()) + ""));
			
			} else {
				
				resultTable.add(new AccountSummaryTableModel(networth.get(i).getName(), Math.abs(networth.get(i).getTotalValue()) + ""));
			
			}
			
		}
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		resultTable.add(new AccountSummaryTableModel("Total Pasivos y Patrimonio", 
		Math.abs(liabilities.get(liabilities.size()-1).getTotalValue()+networth.get(networth.size()-1).getTotalValue())+""));
		
		return resultTable;
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO GENERATE ICO AND EXP DE LA CLASE ACCOUNT SUMMARY TABLE MODEL
	
	public static ArrayList<AccountSummaryTableModel> generateIcoAndExp(ArrayList<AccountSummary> icome ,ArrayList<AccountSummary> expenses, Label ingresoTotal, Label gastosTotales){
		
		ArrayList<AccountSummaryTableModel> resultTable = new ArrayList<AccountSummaryTableModel>();
		
		resultTable.add(new AccountSummaryTableModel("Ingresos:", ""));
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		for (int i = 0 ; i < icome.size() ; i++) {
			
			if(i == icome.size() -1 ) {
				
				resultTable.add(new AccountSummaryTableModel("", ""));
				
				resultTable.add(new AccountSummaryTableModel(icome.get(i).getName(), Math.abs(icome.get(i).getTotalValue()) + ""));
			
			} else {
				
				resultTable.add(new AccountSummaryTableModel(icome.get(i).getName(), Math.abs(icome.get(i).getTotalValue()) + ""));
			
			}
			
		}
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		resultTable.add(new AccountSummaryTableModel("Gastos:", ""));
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		for (int i = 0 ; i < expenses.size() ; i++) {
			
			if(i == expenses.size() -1 ) {
				
				resultTable.add(new AccountSummaryTableModel("", ""));
				
				resultTable.add(new AccountSummaryTableModel(expenses.get(i).getName(), Math.abs(expenses.get(i).getTotalValue()) + ""));
			
			} else {
				
				resultTable.add(new AccountSummaryTableModel(expenses.get(i).getName(), Math.abs(expenses.get(i).getTotalValue()) + ""));
			
			}
			
		}
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		ingresoTotal.setText( Math.abs(icome.get(icome.size() -1 ).getTotalValue()) + "");
		
		gastosTotales.setText( Math.abs(expenses.get(expenses.size() -1 ).getTotalValue()) + "");
		
		return resultTable;
	
	}
	
	// ----------------------------------------------------------------------------------
	
}
