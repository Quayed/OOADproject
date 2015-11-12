package dal.idao;

import java.util.List;

import dal.DalException;
import dal.dto.PitchDTO;

public interface IPitchDAO {
	int createPitch(PitchDTO pitch);
	void updatePitch(PitchDTO pitch);
	PitchDTO getPitch(int pitchId) throws DalException;
	List<PitchDTO> getPitches();
}
