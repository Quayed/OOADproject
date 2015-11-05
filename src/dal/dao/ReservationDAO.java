package dal.dao;

import java.util.List;

import dal.dto.ReservationDTO;
import dal.idao.IReservationDAO;

public class ReservationDAO implements IReservationDAO{

	@Override
	public int createReservation(ReservationDTO reservation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateReservatoin(ReservationDTO reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ReservationDTO getReservation(int reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationDTO> getReservations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationDTO> getReservations(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
