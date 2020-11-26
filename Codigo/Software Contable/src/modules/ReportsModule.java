/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package modules;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

import model.AccountSummary;
import model.Transaction;

public class ReportsModule {

	// ----------------------------------------------------------------------------------

	// UNICO METODO DE LA CLASE REPORTS MODULE

	public static Map<String, double[]> testBalance(ArrayList<Transaction> transactions) {

		Map<String, double[]> map = new Hashtable<String, double[]>();

		double entries = 0;

		double exits = 0;

		for (Transaction transaction : transactions) {

			for (int i = 0; i < transaction.getCuentas().size(); i++) {

				if(map.containsKey(transaction.getCuentas().get(i).getName())) {

					if(transaction.getValoresCuentas().get(i) >= 0) {

						map.get(transaction.getCuentas().get(i).getName())[0] += transaction.getValoresCuentas().get(i);

						entries+=transaction.getValoresCuentas().get(i);

					} else {

						map.get(transaction.getCuentas().get(i).getName())[1] += transaction.getValoresCuentas().get(i);

						exits+=transaction.getValoresCuentas().get(i);

					}

				} else {

					if(transaction.getValoresCuentas().get(i) >= 0) {

						double[] value = {transaction.getValoresCuentas().get(i).doubleValue(), 0};

						map.put(transaction.getCuentas().get(i).getName(), value);

						entries += transaction.getValoresCuentas().get(i);

					} else {

						double[] value = {0,transaction.getValoresCuentas().get(i).doubleValue()};

						map.put(transaction.getCuentas().get(i).getName(), value);

						exits += transaction.getValoresCuentas().get(i);

					}

				}

			}

		}

		double[] totals = {entries,exits};

		map.put("Total", totals);

		//map.forEach((k,v)->System.out.println(k+": Entradas: "+v[0]+" Salidas: "+v[1]));

		return map;

	}

	// ----------------------------------------------------------------------------------

	// ESTADO DE RESULTADOS

	public static ArrayList<ArrayList<AccountSummary>> generalBalance(ArrayList<Transaction> transactions) {

		Map<String,AccountSummary> summary= accountSummary(transactions);

		ArrayList<AccountSummary> assets=new ArrayList<AccountSummary>();

		ArrayList<AccountSummary> liabilities=new ArrayList<AccountSummary>();

		ArrayList<AccountSummary> networth=new ArrayList<AccountSummary>();

		summary.forEach((k,v)->{

			switch (v.getGroup()) {

			case "Activos":

				assets.add(v);
				break;

			case "Pasivos":

				liabilities.add(v);
				break;

			case "Patrimonio":
				networth.add(v);
				break;

			default:
				break;

			}

		});

		double totalAssets = 0;

		double totalLiabilities = 0;

		double totalNetworth = 0;

		for (AccountSummary asset : assets) {

			totalAssets+=asset.getTotalValue();

		}


		for (AccountSummary net : networth) {

			totalNetworth+=net.getTotalValue();

		}

		for (AccountSummary liability : liabilities) {

			totalLiabilities+=liability.getTotalValue();

		}

		assets.add(new AccountSummary("Total Activos", "", totalAssets));

		liabilities.add(new AccountSummary("Total Pasivos", "", totalLiabilities));

		networth.add(new AccountSummary("Total Patrimonio", "", totalNetworth));

		ArrayList<ArrayList<AccountSummary>> result=new ArrayList<ArrayList<AccountSummary>>();

		result.add(assets);

		result.add(liabilities);

		result.add(networth);

		return result;

	}

	// ----------------------------------------------------------------------------------

	// RESUMEN DE CUENTAS

	private static Map<String,AccountSummary> accountSummary(ArrayList<Transaction> transactions) {

		Map<String,AccountSummary> map=new Hashtable<String, AccountSummary>();

		for (Transaction transaction : transactions) {

			for (int i = 0; i < transaction.getCuentas().size(); i++) {

				if(map.containsKey(transaction.getCuentas().get(i).getName())) {

					map.get(transaction.getCuentas().get(i).getName()).addToValue(transaction.getValoresCuentas().get(i).doubleValue());

				} else {

					map.put(transaction.getCuentas().get(i).getName(), 

							new AccountSummary(

									transaction.getCuentas().get(i).getName(),

									transaction.getCuentas().get(i).getGroup(),

									transaction.getValoresCuentas().get(i).doubleValue()));

				}

			}

		}

		return map;

	}

	// ----------------------------------------------------------------------------------

	public static ArrayList<ArrayList<AccountSummary>> generalResultados (ArrayList<Transaction> transactions){

		Map<String,AccountSummary> summary= accountSummary(transactions);

		ArrayList<AccountSummary> income=new ArrayList<AccountSummary>();

		ArrayList<AccountSummary> expenses=new ArrayList<AccountSummary>();


		summary.forEach((k,v)->{

			switch (v.getGroup()) {

			case "Ingresos":

				income.add(v);
				break;

			case "Gastos":

				expenses.add(v);
				break;

			default:
				break;

			}

		});

		double totalIncome = 0;

		double totalExpenses = 0;

		for (AccountSummary entry : income) {

			totalIncome+=entry.getTotalValue();

		}

		for (AccountSummary expense : expenses) {

			totalExpenses+=expense.getTotalValue();

		}

		income.add(new AccountSummary("Total Ingresos", "", totalIncome));

		expenses.add(new AccountSummary("Total Gastos", "", totalExpenses));


		ArrayList<ArrayList<AccountSummary>> result=new ArrayList<ArrayList<AccountSummary>>();

		result.add(income);

		result.add(expenses);


		return result;

	}

	// ----------------------------------------------------------------------------------

}
