package ui;

import java.util.List;

import dal.dto.CustomerDTO;
import dal.dto.ReservationDTO;
import logic.logic.BillItem;

public class TestUI implements IUI {

	@Override
	public int selectScreen() {
		return 1;
	}

	@Override
	public CustomerDTO createCustomer() {
		return new CustomerDTO("Test navn","0987654321");
	}

	@Override
	public ReservationDTO createReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showBill(ReservationDTO reservation, List<BillItem> billItems) {
		// TODO Auto-generated method stub

	}

}
