package ui;

import java.util.List;

import logic.logic.BillItem;
import dal.dto.CustomerDTO;
import dal.dto.ReservationDTO;

public interface IUI {
	int selectScreen();
	CustomerDTO createCustomer();
	ReservationDTO createReservation();
	void showBill(ReservationDTO reservation, List<BillItem> billItems);
}
