package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import logic.ilogic.IReservationLogic;
import logic.logic.BillItem;
import logic.logic.ReservationLogic;

import org.junit.Before;
import org.junit.Test;

import dal.dto.ReservationDTO;

public class TestReservationLogic {
	IReservationLogic reservation;
	ReservationDTO reservationDTO;
	
	int pitchId;
	int customerId;
	int numberOfAdults;
	int numberOfChildren;
	int numberOfDogs;
	
	@Before
	public void init(){
		reservation = new ReservationLogic();
		reservationDTO = new ReservationDTO();
		pitchId = 200;
		customerId = 1;
		numberOfAdults = 2;
		numberOfChildren = 2;
		numberOfDogs = 0;
		reservationDTO.setPitchId(pitchId);
		reservationDTO.setCustomerId(customerId);
		reservationDTO.setAdults(numberOfAdults);
		reservationDTO.setChildren(numberOfChildren);
		reservationDTO.setDogs(numberOfDogs);

	}
	
	@Test
	public void test() {
		boolean foundReservation = false;

		reservationDTO.setArrival("02-04-2015");
		reservationDTO.setDeparture("12-04-2015");
		
		int reservationId = reservation.createReservation(reservationDTO);
		
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
		
		
		
	}
	
	@Test
	public void testGetBillLowSeason(){
		reservationDTO.setArrival("02-04-2015");
		reservationDTO.setDeparture("12-04-2015");
		
		int reservationId = reservation.createReservation(reservationDTO);
		List<BillItem> bill = reservation.getBill(reservationId);
		assertNotNull(bill);
		
		int sum = 0;
		for (BillItem item : bill){
			sum += item.getSumPrice();
		}
		assertEquals(2730, sum);
		
		assertNull(reservation.getBill(9999999));
	}
	
	@Test
	public void testGetBillHighSeason(){
		reservationDTO.setArrival("02-07-2015");
		reservationDTO.setDeparture("12-07-2015");
		
		int reservationId = reservation.createReservation(reservationDTO);
		List<BillItem> bill = reservation.getBill(reservationId);
		assertNotNull(bill);
		
		int sum = 0;
		for (BillItem item : bill){
			sum += item.getSumPrice();
		}
		assertEquals(2970, sum);
		
		assertNull(reservation.getBill(9999999));
	}
}
