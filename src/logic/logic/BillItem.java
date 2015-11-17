package logic.logic;

import java.text.DecimalFormat;

public class BillItem {
	private String title;
	private double units;
	private double unitPrice;
	
	public BillItem(String title, double units, double price) {
		this.title = title;
		this.units = units;
		this.unitPrice = price;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getUnits() {
		return units;
	}
	
	public void setUnits(int units) {
		this.units = units;
	}
	
	public double getSumPrice() {
		double sum = units*unitPrice;
		return sum;
	}
}
