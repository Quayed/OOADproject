package dal.dao;

import java.util.ArrayList;
import java.util.List;

import dal.dto.PriceDTO;
import dal.idao.IPriceDAO;

public class PriceDAO implements IPriceDAO{

	private ArrayList<PriceDTO> prices = new ArrayList<PriceDTO>();
	
	public PriceDAO(){
		prices.add(new PriceDTO("power_hss", 3.75, "01-01-1970"));
		prices.add(new PriceDTO("power_lss", 3.75, "01-01-1970"));
		prices.add(new PriceDTO("caravan_small_hss", 25.0, "01-01-1970"));
		prices.add(new PriceDTO("caravan_small_lss", 25.0, "01-01-1970"));
		prices.add(new PriceDTO("caravan_big_hss", 49.0, "01-01-1970"));
		prices.add(new PriceDTO("caravan_big_lss", 49.0, "01-01-1970"));
		prices.add(new PriceDTO("dog_hss", 10.0, "01-01-1970"));
		prices.add(new PriceDTO("dog_lss", 10.0, "01-01-1970"));
		prices.add(new PriceDTO("adult_hss", 87.0, "01-01-1970"));
		prices.add(new PriceDTO("adult_lss", 82.0, "01-01-1970"));
		prices.add(new PriceDTO("child_hss", 49.0, "01-01-1970"));
		prices.add(new PriceDTO("child_lss", 42.0, "01-01-1970"));
		prices.add(new PriceDTO("camelrent_hss", 50.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin1_hss", 450.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin1_lss", 415.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin2_hss", 410.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin2_lss", 380.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin3_hss", 800.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin3_lss", 700.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin4_hss", 910.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin4_lss", 810.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin5_hss", 890.0, "01-01-1970"));
		prices.add(new PriceDTO("cabin5_lss", 790.0, "01-01-1970"));
		prices.add(new PriceDTO("extraPerson_hss", 100.0, "01-01-1970"));
		prices.add(new PriceDTO("extraPerson_lss", 100.0, "01-01-1970"));
	}
	
	@Override
	public int createPrice(PriceDTO price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatePrice(PriceDTO price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PriceDTO getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PriceDTO> getPrices() {
		// TODO Auto-generated method stub
		return null;
	}

}
