package logic.logic;

import java.util.ArrayList;
import java.util.List;

import logic.ilogic.IPriceLogic;
import logic.ilogic.IReservationLogic;
import dal.dao.CamelRentDAO;
import dal.dao.PitchDAO;
import dal.dto.CamelRentDTO;
import dal.dto.PitchDTO;
import dal.dto.ReservationDTO;
import dal.idao.ICamelRentDAO;
import dal.idao.IPitchDAO;
import dal.idao.IReservationDAO;

public class ReservationLogic implements IReservationLogic{
	
	private IPriceLogic priceLogic = new PriceLogic();
	
	private IReservationDAO reservationDAO;
	private IPitchDAO pitchDao = new PitchDAO();
	private ICamelRentDAO camelRentDAO = new CamelRentDAO();

	@Override
	public int CreateReservation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BillItem> getBill(int reservationId) {
		ReservationDTO reservation = reservationDAO.getReservation(reservationId);
		if(reservation == null){
			
		}
		PitchDTO pitch = pitchDao.getPitch(reservation.getPitchId());
		List<CamelRentDTO> camelRents = camelRentDAO.getCamelRents(reservationId);
		
		List<BillItem> billItems = new ArrayList<BillItem>();
		billItems.add(new BillItem("Pitch price", getNumberOfDays(reservation), priceLogic.getPrice("price_pitch_"+pitch.getType(), reservation.getArrival())));
		

		priceLogic.getPrice("price_camel_rent", reservation.getArrival());
		
		return null;
	}

	@Override
	public List<ReservationDTO> getReservations() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int getNumberOfDays(ReservationDTO reservation){
		return 0;
	}
	

}
