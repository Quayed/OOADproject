package logic.ilogic;

import java.util.List;

import logic.logic.BillItem;
import dal.dto.ReservationDTO;

public interface IReservationLogic {
	int CreateReservation();
	List<BillItem> getBill(int reservationID);
	List<ReservationDTO> getReservations();
}
