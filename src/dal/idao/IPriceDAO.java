package dal.idao;

import java.util.List;

import dal.dto.PriceDTO;

public interface IPriceDAO {
	void createPrice(PriceDTO price);
	void updatePrice(PriceDTO price);
	PriceDTO getPrice();
	List<PriceDTO> getPrices();
}
