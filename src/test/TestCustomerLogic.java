package test;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import dal.dto.CustomerDTO;
import logic.ilogic.ICustomerLogic;
import logic.logic.CustomerLogic;

public class TestCustomerLogic {
	
	@Test
	public void test() {
		ICustomerLogic customerLogic = new CustomerLogic();
		
		CustomerDTO customer = new CustomerDTO("Test name", "1234567890");
		
		int customerId = customerLogic.createCustomer(customer);
		
		assertNotEquals(0, customerId);
	}

}
