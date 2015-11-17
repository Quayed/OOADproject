package dal.dao;

import java.util.ArrayList;
import java.util.List;

import dal.dto.ReservationDTO;
import dal.idao.IReservationDAO;

public class ReservationDAO implements IReservationDAO{

	private List<ReservationDTO> reservations = new ArrayList<ReservationDTO>();
	private int increment = 0;
	
	public ReservationDAO() {
		ReservationDTO reservation = new ReservationDTO();
		reservation.setPitchId(1);
		reservation.setCustomerId(1);
		createReservation(reservation);
	}
	
	@Override
	public int createReservation(ReservationDTO reservation) {
		reservation.setReservationId(++increment);
		reservations.add(reservation);
		return increment;
	}

	@Override
	public void updateReservatoin(ReservationDTO reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ReservationDTO getReservation(int reservationId) {
		for (int r = 0; r < reservations.size(); r++) {
			if(reservations.get(r).getReservationId() == reservationId)
				return reservations.get(r);
		}
		return null;
	}

	@Override
	public List<ReservationDTO> getReservations() {
		return reservations;
	}

	@Override
	public List<ReservationDTO> getReservations(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
