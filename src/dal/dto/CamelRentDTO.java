package dal.dto;

public class CamelRentDTO {
	private int reservationId;
	private int count;
	private int hours;
	
	public CamelRentDTO(CamelRentDTO c) {
		reservationId = c.reservationId;
		count = c.count;
		hours = c.hours;
	}

	public CamelRentDTO(int reservationId, int count, int hours) {
		this.reservationId = reservationId;
		this.count = count;
		this.hours = hours;
	}
	
	public CamelRentDTO() {
	}

	public int getReservationId() {
		return reservationId;
	}
	
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
}
