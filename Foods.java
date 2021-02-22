package DOANJAVA;

import java.io.*;

public class Foods implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	int price;
	// constructor 
	Foods(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void inAn() {
		System.out.println(name + ": " + price +"$");
	}
}
