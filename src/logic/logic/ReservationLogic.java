package logic.logic;

import java.util.ArrayList;
import java.util.List;

import dal.dao.CamelRentDAO;
import dal.dao.PitchDAO;
import dal.dao.ReservationDAO;
import dal.dto.CamelRentDTO;
import dal.dto.PitchDTO;
import dal.dto.ReservationDTO;
import dal.idao.ICamelRentDAO;
import dal.idao.IPitchDAO;
import dal.idao.IReservationDAO;
import logic.ilogic.IPriceLogic;
import logic.ilogic.IReservationLogic;

public class ReservationLogic implements IReservationLogic{
	
	private IPriceLogic priceLogic = new PriceLogic();
	
	private IReservationDAO reservationDAO = new ReservationDAO();
	private IPitchDAO pitchDAO = new PitchDAO();
	private ICamelRentDAO camelRentDAO = new CamelRentDAO();

	@Override
	public int createReservation(ReservationDTO reservation) {
		return reservationDAO.createReservation(reservation);
	}

	@Override
	public List<BillItem> getBill(int reservationId) {
		ReservationDTO reservation = reservationDAO.getReservation(reservationId);
		if(reservation == null){
			return null;
		}
		
		List<BillItem> billItems = new ArrayList<BillItem>();

		PitchDTO pitch = pitchDAO.getPitch(reservation.getPitchId());
		List<CamelRentDTO> camelRents = camelRentDAO.getCamelRents(reservationId);
					
		String pitchType = pitch.getType();
		String arrival = reservation.getArrival();
		int children = reservation.getChildren();
		int adults = reservation.getAdults();
		int dogs = reservation.getDogs();

		if(!pitchType.equals("tent")){
			billItems.add(new BillItem("Pitch fee", DateHelper.getNumberOfDays(reservation), priceLogic.getPrice("pitch_"+pitchType, arrival)));			
		}
		
		if(pitchType.length() >= 5 && pitchType.substring(0, 5).equals("cabin")){
			if(pitchType.equals("cabin4") || pitchType.equals("cabin5")){
				int extraPersons = adults+children - pitch.getMinPersons();
				
				if(extraPersons > 0){
					billItems.add(new BillItem(""+extraPersons + " extra persons", DateHelper.getNumberOfDays(reservation), extraPersons*priceLogic.getPrice("extra_person", arrival)));
				}
			}
		}
		else{
			if(children > 0){
				billItems.add(new BillItem("Children", children, priceLogic.getPrice("child", arrival)));
			}
			if(adults > 0){
				billItems.add(new BillItem("Adults", adults, priceLogic.getPrice("adult", arrival)));
			}
			if(dogs > 0){
				billItems.add(new BillItem("Dogs", dogs, priceLogic.getPrice("dog", arrival)));
			}
		}
		
		
		billItems.add(new BillItem("Power usage", reservation.getPowerUsage(), priceLogic.getPrice("power", arrival)));

		
		for (int i = 0; i < camelRents.size(); i++) {
			CamelRentDTO camelRent = camelRents.get(i);
			billItems.add(new BillItem("Cammels in "+camelRent.getHours()+" h", camelRent.getCount(),
									priceLogic.getPrice("camelrent", arrival)*camelRent.getHours()));
			
		}
				
		return billItems;
	}

	@Override
	public List<ReservationDTO> getReservations() {
		return reservationDAO.getReservations();
	}	

}
