package dal.idao;

import java.util.List;

import dal.dto.PitchDTO;

public interface IPitchDAO {
	int createPitch(PitchDTO pitch);
	void updatePitch(PitchDTO pitch);
	PitchDTO getPitch(int pitchId);
	List<PitchDTO> getPitches();
}
