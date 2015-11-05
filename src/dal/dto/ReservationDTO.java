package dal.dto;

public class ReservationDTO {
	private int reservationId;
	private int customerId;
	private int pitchId;
	private int adults;
	private int children;
	private int dogs;
	private String arrival;
	private String departure;
	private double powerUsage;
	
	public int getReservationId() {
		return reservationId;
	}
	
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getPitchId() {
		return pitchId;
	}
	
	public void setPitchId(int pitchId) {
		this.pitchId = pitchId;
	}
	
	public int getAdults() {
		return adults;
	}
	
	public void setAdults(int adults) {
		this.adults = adults;
	}
	
	public int getChildren() {
		return children;
	}
	
	public void setChildren(int children) {
		this.children = children;
	}
	
	public int getDogs() {
		return dogs;
	}
	
	public void setDogs(int dogs) {
		this.dogs = dogs;
	}
	
	public String getArrival() {
		return arrival;
	}
	
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	
	public String getDeparture() {
		return departure;
	}
	
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
	public double getPowerUsage() {
		return powerUsage;
	}
	
	public void setPowerUsage(double powerUsage) {
		this.powerUsage = powerUsage;
	}
}
