package logic.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dal.dao.PriceDAO;
import dal.dto.PriceDTO;
import dal.idao.IPriceDAO;
import logic.ilogic.IPriceLogic;

public class PriceLogic implements IPriceLogic{
	private IPriceDAO priceDAO = new PriceDAO();

	@Override
	public double getPrice(String priceId, String date) {
		List<PriceDTO> prices = priceDAO.getPrices();
		
		Date datePoint = parseStringToDate(date);
		
		PriceDTO currentPrice = null;
		Date currentPriceDate = null;
		
		for (int p = 0; p < prices.size(); p++) {
			if( prices.get(p).getPriceId().equals(priceId) ){
				Date priceDate = parseStringToDate(prices.get(p).getApplicableFrom());
				if(priceDate.before(datePoint)){
					if(currentPrice == null || priceDate.after(currentPriceDate)){
						currentPrice = prices.get(p);
						currentPriceDate = parseStringToDate(currentPrice.getApplicableFrom());
					}
				}
			}
		}
		
		return 0;
	}
	
	private Date parseStringToDate(String date){
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

}
