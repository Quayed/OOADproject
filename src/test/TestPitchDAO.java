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
		pitch = pitchDAO.getPitch(pitchId);
		assertNotNull(pitch);
		
		pitch = null;
		pitchId = 100000;
		pitch = pitchDAO.getPitch(pitchId);
		assertNull(pitch);
	}

}
