package dal.idao;

import java.util.List;

import dal.dto.CustomerDTO;

public interface ICustomerDAO {
	int createCustomer(CustomerDTO customer);
	void updateCustomer(CustomerDTO customer);
	CustomerDTO getCustomer(int customerId);
	List<CustomerDTO> getCustomers();
}
