package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dal.dao.CustomerDAO;
import dal.dto.CustomerDTO;
import dal.idao.ICustomerDAO;

public class TestCustomerDAO {

	@Test
	public void test() {
		ICustomerDAO customerDao = new CustomerDAO();
		
		CustomerDTO customer = new CustomerDTO("Test name", "1234567890");
		
		int customerId = customerDao.createCustomer(customer);
		
		assertNotEquals(0, customerId);
	}

}
