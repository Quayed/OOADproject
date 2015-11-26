package dal.dao;

import java.util.ArrayList;
import java.util.List;

import dal.dto.PitchDTO;
import dal.idao.IPitchDAO;

public class PitchDAO implements IPitchDAO{

	List<PitchDTO> pitches = new ArrayList<PitchDTO>();
	
	public PitchDAO() {
		pitches.add(new PitchDTO(200, "caravan", 1, 8));
		pitches.add(new PitchDTO(201, "caravan", 1, 8));
		pitches.add(new PitchDTO(202, "caravan", 1, 8));
		pitches.add(new PitchDTO(203, "caravan", 1, 8));
		pitches.add(new PitchDTO(204, "caravan", 1, 8));
		pitches.add(new PitchDTO(205, "caravan", 1, 8));
		pitches.add(new PitchDTO(206, "caravan", 1, 8));
		pitches.add(new PitchDTO(207, "caravan", 1, 8));
		pitches.add(new PitchDTO(208, "caravan", 1, 8));
		pitches.add(new PitchDTO(209, "caravan", 1, 8));
		pitches.add(new PitchDTO(210, "caravan", 1, 8));
		pitches.add(new PitchDTO(211, "caravan", 1, 8));
		pitches.add(new PitchDTO(212, "caravan", 1, 8));
		pitches.add(new PitchDTO(213, "caravan", 1, 8));
		pitches.add(new PitchDTO(214, "caravan", 1, 8));
		pitches.add(new PitchDTO(215, "caravan", 1, 8));
		pitches.add(new PitchDTO(216, "caravan", 1, 8));
		pitches.add(new PitchDTO(217, "caravan", 1, 8));
		pitches.add(new PitchDTO(218, "caravan", 1, 8));
		pitches.add(new PitchDTO(219, "caravan", 1, 8));
		
		pitches.add(new PitchDTO(100, "tent", 1, 8));
		pitches.add(new PitchDTO(101, "tent", 1, 8));
		pitches.add(new PitchDTO(102, "tent", 1, 8));
		pitches.add(new PitchDTO(103, "tent", 1, 8));
		pitches.add(new PitchDTO(104, "tent", 1, 8));
		pitches.add(new PitchDTO(105, "tent", 1, 8));
		pitches.add(new PitchDTO(106, "tent", 1, 8));
		pitches.add(new PitchDTO(107, "tent", 1, 8));
		pitches.add(new PitchDTO(108, "tent", 1, 8));
		pitches.add(new PitchDTO(109, "tent", 1, 8));
		pitches.add(new PitchDTO(110, "tent", 1, 8));
		pitches.add(new PitchDTO(111, "tent", 1, 8));
		pitches.add(new PitchDTO(112, "tent", 1, 8));
		pitches.add(new PitchDTO(113, "tent", 1, 8));
		pitches.add(new PitchDTO(114, "tent", 1, 8));
		pitches.add(new PitchDTO(115, "tent", 1, 8));
		pitches.add(new PitchDTO(116, "tent", 1, 8));
		pitches.add(new PitchDTO(117, "tent", 1, 8));
		pitches.add(new PitchDTO(118, "tent", 1, 8));
		pitches.add(new PitchDTO(119, "tent", 1, 8));
		
		pitches.add(new PitchDTO(6, "cabin", 1, 2));
		pitches.add(new PitchDTO(7, "cabin", 1, 2));
		pitches.add(new PitchDTO(8, "cabin", 1, 2));
		pitches.add(new PitchDTO(9, "cabin", 1, 2));
		
		pitches.add(new PitchDTO(10, "cabin", 1, 2));
		pitches.add(new PitchDTO(11, "cabin", 1, 2));
		pitches.add(new PitchDTO(27, "cabin", 1, 2));
		pitches.add(new PitchDTO(28, "cabin", 1, 2));
		pitches.add(new PitchDTO(29, "cabin", 1, 2));
		pitches.add(new PitchDTO(30, "cabin", 1, 2));
		
		pitches.add(new PitchDTO(40, "cabin", 1, 4));
		pitches.add(new PitchDTO(41, "cabin", 1, 4));
		
		//luksus hytter
		pitches.add(new PitchDTO(44, "cabin", 4, 6));
		pitches.add(new PitchDTO(45, "cabin", 4, 6));
		
		pitches.add(new PitchDTO(65, "cabin", 4, 6));
		pitches.add(new PitchDTO(66, "cabin", 4, 6));
		pitches.add(new PitchDTO(67, "cabin", 4, 6));
		pitches.add(new PitchDTO(68, "cabin", 4, 6));
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
