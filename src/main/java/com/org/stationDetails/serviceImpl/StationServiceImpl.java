/**
 * 
 */
package com.org.stationDetails.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.org.stationDetails.domain.Station;
import com.org.stationDetails.repository.StationRepository;
import com.org.stationDetails.service.IStationService;
import com.org.stationDetails.vo.StationVo;

/**
 * @author vijayendrakantipudi
 *
 */
@Service
public class StationServiceImpl implements IStationService{
	
	@Autowired
	StationRepository stationRepository;
	
	Gson gson = new Gson();
	
	@Override
	public List<Station> getAllStationDetails() {
		List<Station> station = stationRepository.findAll();
		System.out.println("station is ====================================" + station);
//		List<StationVo> stationVo = new ArrayList<>(); 
//		StationVo svo = new StationVo();
//		for(Station stationdata : station) {
//			System.out.println("stationdata is ++++++++++++++++++++++++++++++++++++" + stationdata);
//			svo.setStationId(stationdata.getStationId());
//			svo.setName(stationdata.getName());
//			svo.setCallSign(stationdata.getCallSign());
//			svo.setHdEnabled(stationdata.isHdEnabled());
//			System.out.println("station data is : " + svo.toString());
//			stationVo.add(svo);
//		}
		
		System.out.println("station data is : " + station.toString());
		return station;
	}

	@Override
	public String deleteStationDetails() {
		stationRepository.deleteAll();
		return "success";
	}

	@Override
	public String addStationDetails(List<Station> stationVo) {
		System.out.println("station is ---------------------------------------------" + stationVo);
				stationRepository.save(stationVo);         
		return "Success";
	}

	@Override
	public String updateStationDetails(List<StationVo> stationVo, String stationId) {
		System.out.println("reterive station is @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + stationVo);
		Station station = stationRepository.findByStationId(stationId);
		System.out.println("reterive station1 is !!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + station);
		
		if(station != null) {
			for(StationVo stationVo1 : stationVo) {
			//station.setStationId(stationVo1.getStationId());
			station.setName(stationVo1.getName());
			station.setCallSign(stationVo1.getCallSign());
			station.setHdEnabled(stationVo1.isHdEnabled());
			stationRepository.save(station);
			}
		}
		return "Success";
	}

	@Override
	public List<Station> getStationDetailsByStationIdorName(String stationId, String name) {
		List<Station> station = stationRepository.findByStationIdOrName(stationId, name);
		System.out.println("station details for id or name *****************************" + station );
		return station;
	}

	@Override
	public List<Station> getStationDetailsforhdEnabled() {
		List<Station> station = (List<Station>) stationRepository.findByhdEnabledTrue();
		System.out.println("station is : ++++++++++++++++++++++" + station);
		return station;
	}

	

}
