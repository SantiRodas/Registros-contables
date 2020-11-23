package model;

public class AccountSummary {
	
	private String name;
	private String group;
	private double totalValue;
	public String getName() {
		return name;
	}
	public String getGroup() {
		return group;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	public AccountSummary(String name, String group, double totalValue) {
		super();
		this.name = name;
		this.group = group;
		this.totalValue = totalValue;
	}
	
	public void addToValue(double add) {
		this.totalValue+=add;
	}
	
	

}
