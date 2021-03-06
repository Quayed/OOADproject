package dal.dto;

public class CustomerDTO {
	private int customerId;
	private String name;
	private String phone;
	
	public CustomerDTO(String name, String phone) {
		this.name = name;
		this.phone = name;
	}

	public CustomerDTO(CustomerDTO customer) {
		customerId = customer.customerId;
		name = customer.name;
		phone = customer.phone;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
