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
		
		String seasonSufix = isHighSeason(datePoint) ? "_hss" : "_lss";
		
		for (int p = 0; p < prices.size(); p++) {
			PriceDTO price = prices.get(p);
			if( price.getPriceId().equals(priceId) || price.getPriceId().equals(priceId+seasonSufix)){
				Date priceDate = parseStringToDate(price.getApplicableFrom());
				if(priceDate.before(datePoint)){
					if(currentPrice == null || priceDate.after(currentPriceDate)){
						currentPrice = price;
						currentPriceDate = parseStringToDate(currentPrice.getApplicableFrom());
					}
				}
			}
		}
		
		if(currentPrice == null)
			return 0;
		
		return currentPrice.getAmount();
	}
	
	private boolean isHighSeason(Date datePoint) {
		String year = new SimpleDateFormat("yyyy").format(datePoint);
		
		try {
			return datePoint.after(parseStringToDate("12-06-"+year)) && datePoint.before(parseStringToDate("16-08-"+year));
		} catch (NullPointerException e) {
			return false;
		}		
	}
	
	private Date parseStringToDate(String date){
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

}
