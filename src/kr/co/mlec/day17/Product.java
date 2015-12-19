package kr.co.mlec.day17;

import java.io.Serializable;

public class Product implements Serializable{
	private String com;
	private String name;
	private String no;
	private String price;
	
	public Product() {
		super();
	}
	
	public Product(String com, String name, String no, String price) {
		super();
		this.com = com;
		this.name = name;
		this.no = no;
		this.price = price;
	}

	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String toString() {
		return com + "\t" + name + "\t" + no + "\t" + price;
	}
	
}
