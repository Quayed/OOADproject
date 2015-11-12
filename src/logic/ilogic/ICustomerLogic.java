package logic.ilogic;

import dal.dto.CustomerDTO;

public interface ICustomerLogic {
	int createCustomer(CustomerDTO customer);
}
