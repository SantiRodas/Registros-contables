package model;

public class Account {
	
	private String code;
	private String name;
	private String group;
	private boolean resultAccount;
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String getGroup() {
		return group;
	}
	public boolean isResultAccount() {
		return resultAccount;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void setResultAccount(boolean resultAccount) {
		this.resultAccount = resultAccount;
	}
	public Account(String code, String name, String group, boolean resultAccount) {
		super();
		this.code = code;
		this.name = name;
		this.group = group;
		this.resultAccount = resultAccount;
	}
	
	
	

}
