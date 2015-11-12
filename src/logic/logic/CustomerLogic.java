package logic.logic;

import dal.dao.CustomerDAO;
import dal.dto.CustomerDTO;
import dal.idao.ICustomerDAO;
import logic.ilogic.ICustomerLogic;

public class CustomerLogic implements ICustomerLogic{

	ICustomerDAO customerDAO = new CustomerDAO();
	
	@Override
	public int createCustomer(CustomerDTO customer) {
		return customerDAO.createCustomer(customer);
	}

}
