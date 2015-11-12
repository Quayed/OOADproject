package controller;

import dal.dto.CustomerDTO;
import logic.ilogic.ICustomerLogic;
import logic.logic.CustomerLogic;
import ui.IUI;

public class Controller {

	IUI ui;
	ICustomerLogic customerLogic = new CustomerLogic();
	boolean exit = false;

	public Controller(IUI ui) {
		this.ui = ui;
	}
	
	public void start() {
		while(!exit){
			int screen = ui.selectScreen();
			doAction(screen);	
		}
	}

	private void doAction(int screen) {
		switch (screen) {
		case 0:
			exit = true;
			break;
		case 1:
			CustomerDTO customer = ui.createCustomer();
			int customerId = customerLogic.createCustomer(customer);
			ui.customerCreated(customerId);
			break;

		default:
			break;
		}
	}

}
