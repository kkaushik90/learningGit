package com.xebia.ds.domain;

public class Contact {

	private String name;
	private String address;
	private long number;
	private int code;
	private String alias;
	public Contact(String name, String address, long number, int code,
			String alias, String category) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
		this.code = code;
		this.alias = alias;
		this.category = category;
	}

	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
