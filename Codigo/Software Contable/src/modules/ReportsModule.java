package modules;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

import javafx.util.Pair;
import model.Account;
import model.Transaction;

public class ReportsModule {
	
	public static Map<String, double[]> testBalance(ArrayList<Transaction> transactions) {
		Map<String, double[]> map=new Hashtable<String, double[]>();
		double entries=0;
		double exits=0;
		for (Transaction transaction : transactions) {
			for (int i = 0; i < transaction.getCuentas().size(); i++) {
				if(map.containsKey(transaction.getCuentas().get(i).getName())) {
					if(transaction.getValoresCuentas().get(i)>=0) {
						map.get(transaction.getCuentas().get(i).getName())[0]+=transaction.getValoresCuentas().get(i);
						entries+=transaction.getValoresCuentas().get(i);
					}
					else {
						map.get(transaction.getCuentas().get(i).getName())[1]+=transaction.getValoresCuentas().get(i);
						exits+=transaction.getValoresCuentas().get(i);
					}
				}
				else {
					if(transaction.getValoresCuentas().get(i)>=0) {
						double[] value= {transaction.getValoresCuentas().get(i).doubleValue(),0};
						map.put(transaction.getCuentas().get(i).getName(), value);
						entries+=transaction.getValoresCuentas().get(i);
					}
					else {
						double[] value= {0,transaction.getValoresCuentas().get(i).doubleValue()};
						map.put(transaction.getCuentas().get(i).getName(), value);
						exits+=transaction.getValoresCuentas().get(i);
					}
				}
			}
		}
		double[] totals= {entries,exits};
		map.put("Total", totals);
		map.forEach((k,v)->System.out.println(k+": Entradas: "+v[0]+" Salidas: "+v[1]));
		return map;
	}

}
