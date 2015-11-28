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
		reservation.setPitchId(6);
		reservation.setCustomerId(1);
		reservation.setArrival("10-10-2015");
		reservation.setAdults(2);
		reservation.setChildren(2);
		reservation.setDogs(2);
		reservation.setDeparture("17-10-2015");
		reservation.setPowerUsage(0.1);
		createReservation(reservation);
	}
	
	@Override
	public int createReservation(ReservationDTO reservation) {
		reservation = new ReservationDTO(reservation);
		reservation.setReservationId(++increment);
		reservations.add(reservation);
		return increment;
	}

	@Override
	public ReservationDTO getReservation(int reservationId) {
		for (int r = 0; r < reservations.size(); r++) {
			if(reservations.get(r).getReservationId() == reservationId)
				return new ReservationDTO(reservations.get(r));
		}
		return null;
	}

	@Override
	public List<ReservationDTO> getReservations() {
		List<ReservationDTO> reservations = new ArrayList<ReservationDTO>();
		for (int r = 0; r < this.reservations.size(); r++) {
			reservations.add(new ReservationDTO(this.reservations.get(r)));
		}
		return reservations;
	}

	@Override
	public List<ReservationDTO> getReservations(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateReservatoin(ReservationDTO reservation) {
		// TODO Auto-generated method stub
		
	}

}
