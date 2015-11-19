package ui;

import java.util.List;

import logic.logic.BillItem;
import dal.dto.CustomerDTO;
import dal.dto.ReservationDTO;

public interface IUI {
	int selectScreen();
	CustomerDTO createCustomer();
	void customerCreated(int customerId);
	ReservationDTO createReservation();
	void reservationCreated(int reservationId);
	int getReservationBill();
	void showBill(ReservationDTO reservation, List<BillItem> billItems);
}
