package dal.dao;

import java.util.ArrayList;
import java.util.List;

import dal.dto.CamelRentDTO;
import dal.idao.ICamelRentDAO;

public class CamelRentDAO implements ICamelRentDAO{

	private List<CamelRentDTO> camelRents = new ArrayList<CamelRentDTO>();
	
	public CamelRentDAO() {
		camelRents.add(new CamelRentDTO(1, 3, 2));
	}
	
	@Override
	public int createCamelRent(CamelRentDTO camelRent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateCamelRent(CamelRentDTO camelRent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CamelRentDTO getCamelRent(int camelRentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CamelRentDTO> getCamelRents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CamelRentDTO> getCamelRents(int reservationId) {
		List<CamelRentDTO> camelRents = new ArrayList<CamelRentDTO>();
		for (int c = 0; c < this.camelRents.size(); c++) {
			if(this.camelRents.get(c).getReservationId() == reservationId)
				camelRents.add(new CamelRentDTO(this.camelRents.get(c)));
		}
		return camelRents;
	}

}
