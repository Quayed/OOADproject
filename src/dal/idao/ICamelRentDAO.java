package dal.idao;

import java.util.List;

import dal.dto.CamelRentDTO;

public interface ICamelRentDAO {
	int createCamelRent(CamelRentDTO camelRent);
	void updateCamelRent(CamelRentDTO camelRent);
	CamelRentDTO getCamelRent(int camelRentId);
	List<CamelRentDTO> getCamelRents();
	List<CamelRentDTO> getCamelRents(int reservationId);
}
