package dal.dto;

public class PriceDTO {
	private String priceId;
	private double amount;
	private String applicableFrom;
	
	public PriceDTO(String priceId, double amount, String applicableFrom){
		this.priceId = priceId;
		this.amount = amount;
		this.applicableFrom = applicableFrom;
	}
	
	public String getPriceId() {
		return priceId;
	}
	
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getApplicableFrom() {
		return applicableFrom;
	}
	
	public void setApplicableFrom(String applicableFrom) {
		this.applicableFrom = applicableFrom;
	}
}
