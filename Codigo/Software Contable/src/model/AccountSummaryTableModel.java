package model;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;

public class AccountSummaryTableModel {
	
	private SimpleStringProperty nombre;

	private SimpleStringProperty valor;

	public String getNombre() {
		return nombre.get();
	}

	public String getValor() {
		return valor.get();
	}

	public void setNombre(SimpleStringProperty nombre) {
		this.nombre = nombre;
	}

	public void setValor(SimpleStringProperty valor) {
		this.valor = valor;
	}

	public AccountSummaryTableModel(String nombre, String valor) {
		super();
		this.nombre = new SimpleStringProperty(nombre);
		this.valor = new SimpleStringProperty(valor);
	}
	
	public static ArrayList<AccountSummaryTableModel> generateAssetsList(ArrayList<AccountSummary> assets){
		
		ArrayList<AccountSummaryTableModel> assetsTable=new ArrayList<AccountSummaryTableModel>();
		
		assetsTable.add(new AccountSummaryTableModel("Activos:", ""));
		assetsTable.add(new AccountSummaryTableModel("", ""));
		for (int i = 0; i < assets.size(); i++) {
			
			if(i==assets.size()-1) {
				assetsTable.add(new AccountSummaryTableModel("", ""));
				assetsTable.add(new AccountSummaryTableModel(assets.get(i).getName(), assets.get(i).getTotalValue()+""));
			}
			else {
				assetsTable.add(new AccountSummaryTableModel(assets.get(i).getName(), assets.get(i).getTotalValue()+""));
			}
			
		}
		
		return assetsTable;
		
	}
	
	public static ArrayList<AccountSummaryTableModel> generateLiabilitiesAndNetworthList(ArrayList<AccountSummary> liabilities,ArrayList<AccountSummary> networth){
		
		ArrayList<AccountSummaryTableModel> resultTable=new ArrayList<AccountSummaryTableModel>();
		
		resultTable.add(new AccountSummaryTableModel("Pasivos:", ""));
		resultTable.add(new AccountSummaryTableModel("", ""));
		for (int i = 0; i < liabilities.size(); i++) {
			
			if(i==liabilities.size()-1) {
				resultTable.add(new AccountSummaryTableModel("", ""));
				resultTable.add(new AccountSummaryTableModel(liabilities.get(i).getName(), liabilities.get(i).getTotalValue()+""));
			}
			else {
				resultTable.add(new AccountSummaryTableModel(liabilities.get(i).getName(), liabilities.get(i).getTotalValue()+""));
			}
			
		}
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		resultTable.add(new AccountSummaryTableModel("Patrimonio:", ""));
		resultTable.add(new AccountSummaryTableModel("", ""));
		
		
		for (int i = 0; i < networth.size(); i++) {
			
			if(i==networth.size()-1) {
				resultTable.add(new AccountSummaryTableModel("", ""));
				resultTable.add(new AccountSummaryTableModel(networth.get(i).getName(), networth.get(i).getTotalValue()+""));
			}
			else {
				resultTable.add(new AccountSummaryTableModel(networth.get(i).getName(), networth.get(i).getTotalValue()+""));
			}
			
		}
		
		resultTable.add(new AccountSummaryTableModel("", ""));
		resultTable.add(new AccountSummaryTableModel("Total Pasivos y Patrimonio", 
				liabilities.get(liabilities.size()-1).getTotalValue()+networth.get(networth.size()-1).getTotalValue()+""
		));
		
		return resultTable;
		
	}
	
	
	
	

}
