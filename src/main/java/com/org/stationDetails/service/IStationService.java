/**
 * 
 */
package com.org.stationDetails.service;

import java.util.List;

import com.org.stationDetails.domain.Station;
import com.org.stationDetails.vo.StationVo;

/**
 * @author vijayendrakantipudi
 *
 */
public interface IStationService {
	
	public List<Station> getAllStationDetails();
	
	public String deleteStationDetails();
	
	public String addStationDetails(List<Station> station);
	
	public String updateStationDetails(List<StationVo> station, String stationId);

	public List<Station> getStationDetailsByStationIdorName(String stationId, String name);
	
	public List<Station> getStationDetailsforhdEnabled();

}
