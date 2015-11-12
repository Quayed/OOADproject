package controller;

import dal.dto.CustomerDTO;
import logic.ilogic.ICustomerLogic;
import logic.logic.CustomerLogic;
import ui.IUI;

public class Controller {

	IUI ui;
	ICustomerLogic customerLogic = new CustomerLogic();

	public Controller(IUI ui) {
		this.ui = ui;
	}
	
	public void start() {
		int screen = ui.selectScreen();
		doAction(screen);
	}

	private void doAction(int screen) {
		switch (screen) {
		case 1:
			CustomerDTO customer = ui.createCustomer();
			customerLogic.createCustomer(customer);
			break;

		default:
			break;
		}
	}

}
