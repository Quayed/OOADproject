package logic.logic;

import java.util.ArrayList;
import java.util.List;

import logic.ilogic.IPriceLogic;
import logic.ilogic.IReservationLogic;
import dal.dao.CamelRentDAO;
import dal.dao.PitchDAO;
import dal.dao.ReservationDAO;
import dal.dto.CamelRentDTO;
import dal.dto.PitchDTO;
import dal.dto.ReservationDTO;
import dal.idao.ICamelRentDAO;
import dal.idao.IPitchDAO;
import dal.idao.IReservationDAO;

public class ReservationLogic implements IReservationLogic{
	
	private IPriceLogic priceLogic = new PriceLogic();
	
	private IReservationDAO reservationDAO = new ReservationDAO();
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
			return null;
		}
		
		List<BillItem> billItems = new ArrayList<BillItem>();

		PitchDTO pitch = pitchDao.getPitch(reservation.getPitchId());
		List<CamelRentDTO> camelRents = camelRentDAO.getCamelRents(reservationId);
				
		billItems.add(new BillItem("Pitch price", getNumberOfDays(reservation), priceLogic.getPrice("pitch_"+pitch.getType(), reservation.getArrival())));
		billItems.add(new BillItem("Power usage", reservation.getPowerUsage(), priceLogic.getPrice("power", reservation.getArrival())));

		
		priceLogic.getPrice("power", reservation.getArrival());

		
		for (int i = 0; i < camelRents.size(); i++) {
			CamelRentDTO camelRent = camelRents.get(i);
			billItems.add(new BillItem("Cammel rent in "+camelRent.getHours()+" hours", camelRent.getCount(),
									priceLogic.getPrice("camelrent", reservation.getArrival())*camelRent.getHours()));
			
		}
				
		return billItems;
	}

	@Override
	public List<ReservationDTO> getReservations() {
		return reservationDAO.getReservations();
	}
	
	private int getNumberOfDays(ReservationDTO reservation){
		return 0;
	}
	

}
