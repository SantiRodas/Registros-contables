package model;

public class ThirdParty {
	
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ThirdParty(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

}
