package logic.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dal.dto.ReservationDTO;

public class DateHelper {
	
	public static final Date parseStringToDate(String date){
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}
	
	public static final int getNumberOfDays(ReservationDTO reservation){
		Date d1 = DateHelper.parseStringToDate(reservation.getArrival());
		Date d2 = DateHelper.parseStringToDate(reservation.getDeparture());
		
		int days = (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
		return days;
	}
}
