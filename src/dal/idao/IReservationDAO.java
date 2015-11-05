package dal.idao;

import java.util.List;

import dal.dto.ReservationDTO;

public interface IReservationDAO {
	int createReservation(ReservationDTO reservation);
	void updateReservatoin(ReservationDTO reservation);
	ReservationDTO getReservation(int reservationId);
	List<ReservationDTO> getReservations();
	List<ReservationDTO> getReservations(int customerId);
}
