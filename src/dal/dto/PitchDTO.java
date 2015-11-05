package dal.dto;

public class PitchDTO {
	private int pitchId;
	private int type;
	private int minPersons;
	private int maxPersons;
	
	public int getPitchId() {
		return pitchId;
	}
	
	public void setPitchId(int pitchId) {
		this.pitchId = pitchId;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
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
