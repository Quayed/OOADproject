package dal.dao;

import java.util.ArrayList;
import java.util.List;

import dal.dto.PitchDTO;
import dal.idao.IPitchDAO;

public class PitchDAO implements IPitchDAO{

	List<PitchDTO> pitches = new ArrayList<PitchDTO>();
	
	public PitchDAO() {
		//Liste over små campingvognspladser
		pitches.add(new PitchDTO(200, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(201, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(202, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(203, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(204, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(205, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(206, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(207, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(208, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(209, "caravan_small", 1, 8));
		pitches.add(new PitchDTO(210, "caravan_small", 1, 8));
		
		//Liste over store campingvognpladser
		pitches.add(new PitchDTO(211, "caravan_big", 1, 8));
		pitches.add(new PitchDTO(212, "caravan_big", 1, 8));
		pitches.add(new PitchDTO(213, "caravan_big", 1, 8));
		pitches.add(new PitchDTO(214, "caravan_big", 1, 8));
		pitches.add(new PitchDTO(215, "caravan_big", 1, 8));
		pitches.add(new PitchDTO(216, "caravan_big", 1, 8));
		pitches.add(new PitchDTO(217, "caravan_big", 1, 8));
		pitches.add(new PitchDTO(218, "caravan_big", 1, 8));
		pitches.add(new PitchDTO(219, "caravan_big", 1, 8));
		
		//Liste over teltpladser
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
		
		//Hytte nr. 6-9
		pitches.add(new PitchDTO(6, "cabin1", 1, 2));
		pitches.add(new PitchDTO(7, "cabin1", 1, 2));
		pitches.add(new PitchDTO(8, "cabin1", 1, 2));
		pitches.add(new PitchDTO(9, "cabin1", 1, 2));
		
		//Hytte nr. 10, 11 og 27-30
		pitches.add(new PitchDTO(10, "cabin2", 1, 2));
		pitches.add(new PitchDTO(11, "cabin2", 1, 2));
		pitches.add(new PitchDTO(27, "cabin2", 1, 2));
		pitches.add(new PitchDTO(28, "cabin2", 1, 2));
		pitches.add(new PitchDTO(29, "cabin2", 1, 2));
		pitches.add(new PitchDTO(30, "cabin2", 1, 2));
		
		//Hytte nr. 40 og 41
		pitches.add(new PitchDTO(40, "cabin3", 1, 4));
		pitches.add(new PitchDTO(41, "cabin3", 1, 4));
		
		//Luksus hytte nr. 44 og 45
		pitches.add(new PitchDTO(44, "cabin4", 4, 6));
		pitches.add(new PitchDTO(45, "cabin4", 4, 6));
		
		//Luksus hytte nr 65-68
		pitches.add(new PitchDTO(65, "cabin4", 4, 6));
		pitches.add(new PitchDTO(66, "cabin4", 4, 6));
		pitches.add(new PitchDTO(67, "cabin4", 4, 6));
		pitches.add(new PitchDTO(68, "cabin4", 4, 6));
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
				return new PitchDTO(pitch);
			}
		}
		return null;
	}

}
