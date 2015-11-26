package dal.dao;

import java.util.ArrayList;
import java.util.List;

import dal.dto.CustomerDTO;
import dal.idao.ICustomerDAO;

public class CustomerDAO implements ICustomerDAO{
	
	private List<CustomerDTO> customers = new ArrayList<CustomerDTO>();
	private int increment = 0;

	@Override
	public int createCustomer(CustomerDTO customer) {
		customer = new CustomerDTO(customer);
		customer.setCustomerId(++increment);
		customers.add(customer);
		return increment;
	}

	@Override
	public void updateCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerDTO getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
