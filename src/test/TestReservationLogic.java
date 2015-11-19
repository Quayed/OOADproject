package test;

import static org.junit.Assert.*;

import java.util.List;

import logic.ilogic.IReservationLogic;
import logic.logic.ReservationLogic;

import org.junit.Test;

import dal.dto.ReservationDTO;

public class TestReservationLogic {

	@Test
	public void test() {
		IReservationLogic reservation = new ReservationLogic();
		ReservationDTO reservationDTO = new ReservationDTO();
		
		boolean foundReservation = false;
		
		int pitchId = 2;
		int customerId = 1;
		int numberOfAdults = 2;
		int numberOfChildren = 2;
		int numberOfDogs = 0;
		
		reservationDTO.setPitchId(pitchId);
		reservationDTO.setCustomerId(customerId);
		reservationDTO.setAdults(numberOfAdults);
		reservationDTO.setChildren(numberOfChildren);
		reservationDTO.setDogs(numberOfDogs);
		reservationDTO.setArrival("02-04-2015");
		reservationDTO.setDeparture("12-04-2015");
		
		
		int reservationId = reservation.CreateReservation(reservationDTO);
		
		assertNotEquals(0, reservationId);
		
		List<ReservationDTO> reservations = reservation.getReservations();
		for(ReservationDTO currentReservation : reservations){
			if (currentReservation.getReservationId() == reservationId){
				foundReservation = true;
				assertEquals(currentReservation.getPitchId(), pitchId);
				assertEquals(currentReservation.getCustomerId(), customerId);
				assertEquals(currentReservation.getAdults(), numberOfAdults);
				assertEquals(currentReservation.getChildren(), numberOfChildren);
				assertEquals(currentReservation.getDogs(), numberOfDogs);
			}
		}
		
		assertTrue(foundReservation);
		
		
		//TODO muligvis forbedring af test af getBill
		assertNotNull(reservation.getBill(reservationId));
		assertNull(reservation.getBill(9999999));
		
	}
}
