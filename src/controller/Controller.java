package controller;

import java.util.List;

import dal.dto.CustomerDTO;
import dal.dto.ReservationDTO;
import logic.ilogic.ICustomerLogic;
import logic.ilogic.IReservationLogic;
import logic.logic.CustomerLogic;
import logic.logic.ReservationLogic;
import ui.IUI;

public class Controller {

	IUI ui;
	ICustomerLogic customerLogic = new CustomerLogic();
	IReservationLogic reservationLogic = new ReservationLogic();
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
		case 3:
			List<ReservationDTO> reservations = reservationLogic.getReservations();
			ReservationDTO reservation = null;
			while(reservation == null){
				int reservationId = ui.getReservationBill();
				for (int r = 0; r < reservations.size(); r++) {
					if(reservations.get(r).getReservationId() == reservationId)
						reservation = reservations.get(r);
				}
			}
			
			ui.showBill(reservation, reservationLogic.getBill(reservation.getReservationId()));
			break;

		default:
			break;
		}
	}

}
