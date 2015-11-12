package dal.dto;

public class PitchDTO {
	private int pitchId;
	private String type;
	private int minPersons;
	private int maxPersons;
	
	public PitchDTO(int pitchId, String type, int minPersons, int maxPersons) {
		this.pitchId = pitchId;
		this.type = type;
		this.minPersons = minPersons;
		this.maxPersons = maxPersons;
	}
	
	public int getPitchId() {
		return pitchId;
	}
	
	public void setPitchId(int pitchId) {
		this.pitchId = pitchId;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getMinPersons() {
		return minPersons;
	}
	
	public void setMinPersons(int minPersons) {
		this.minPersons = minPersons;
	}
	
	public int getMaxPersons() {
		return maxPersons;
	}
	
	public void setMaxPersons(int maxPersons) {
		this.maxPersons = maxPersons;
	}
}
