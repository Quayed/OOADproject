package test;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;

import dal.dao.ReservationDAO;
import dal.dto.ReservationDTO;
import dal.idao.IReservationDAO;

public class TestReservationDAO {

	@Test
	public void testCreate() {
		IReservationDAO reservationDao = new ReservationDAO();
		
		ReservationDTO reservation = new ReservationDTO();
		
		int customerId = reservationDao.createReservation(reservation);
		
		assertNotEquals(0, customerId);
	}
	
	@Test
	public void test() {
		IReservationDAO reservationDao = new ReservationDAO();
		
		List<ReservationDTO> reservations = reservationDao.getReservations();
		
		assertNotEquals(null, reservations);

	}

}
