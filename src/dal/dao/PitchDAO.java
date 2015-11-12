package dal.dao;

import java.util.ArrayList;
import java.util.List;

import dal.dto.PitchDTO;
import dal.idao.IPitchDAO;

public class PitchDAO implements IPitchDAO{

	List<PitchDTO> pitches = new ArrayList<PitchDTO>();
	
	public PitchDAO() {
		pitches.add(new PitchDTO(1, "caravan", 1, 2));
		pitches.add(new PitchDTO(2, "tent", 1, 2));
		pitches.add(new PitchDTO(3, "cabin", 1, 2));
	}
	
	@Override
	public int createPitch(PitchDTO pitch) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatePitch(PitchDTO pitch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PitchDTO getPitch(int pitchId) {
		return findPitch(pitchId);
	}

	@Override
	public List<PitchDTO> getPitches() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private PitchDTO findPitch(int pitchId){
		for (int i = 0; i < pitches.size(); i++) {
			PitchDTO pitch = pitches.get(i);
			if(pitch.getPitchId() == pitchId){
				return pitch;
			}
		}
		return null;
	}

}
