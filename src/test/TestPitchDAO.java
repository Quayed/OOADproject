package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dal.DalException;
import dal.dao.PitchDAO;
import dal.dto.PitchDTO;
import dal.idao.IPitchDAO;

public class TestPitchDAO {

	@Test
	public void test() {
		IPitchDAO pitchDAO = new PitchDAO();
		PitchDTO pitch;
		int pitchId;
		
		pitch = null;
		pitchId = 1;
		try {
			pitch = pitchDAO.getPitch(pitchId);
		} catch (DalException e) {
			System.out.println(e.getMessage());
		}
		assertNotNull(pitch);
		
		pitch = null;
		pitchId = 100000;
		try {
			pitch = pitchDAO.getPitch(pitchId);
		} catch (DalException e) {
			System.out.println(e.getMessage());
		}
		assertNull(pitch);
	}

}
