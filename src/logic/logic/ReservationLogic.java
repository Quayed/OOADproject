package logic.logic;

import java.util.List;

import logic.ilogic.IReservationLogic;
import dal.dto.ReservationDTO;
import dal.idao.IReservationDAO;

public class ReservationLogic implements IReservationLogic{
	
	private IReservationDAO reservationDAO;
	
	@Override
	public int CreateReservation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BillItem> getBill(int reservationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationDTO> getReservations() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
