/**
 * 
 */
package com.org.stationDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.stationDetails.domain.Station;
import com.org.stationDetails.service.IStationService;
import com.org.stationDetails.vo.StationVo;

/**
 * @author vijayendrakantipudi
 *
 */

@RestController
public class StationController {
	
	@Autowired
	IStationService stationService;
	
	@RequestMapping(path = "/getall/station_details/", value = "/getall/station_details/", method = RequestMethod.GET, produces = {"application/json"})
	public List<Station> reteriveAllStationDetails() throws Exception{
		return stationService.getAllStationDetails();
		
	}
	
	@RequestMapping(path = "/saveall/station_details", value = "/saveall/station_details", method = RequestMethod.POST, consumes = { "application/json" })
	public String addStationDetails( @RequestBody List<Station> station) throws Exception {
		System.out.println("in  the controller ------------------------------------------------------------");
		return stationService.addStationDetails(station);
	}
	
	@RequestMapping(path = "/delete/station_details", value = "/delete/station_details", method = RequestMethod.DELETE)
	public String removeStation() {
		return stationService.deleteStationDetails();	
	}
	
	@RequestMapping(path = "/update/station_details/{stationId}", value = "/update/station_details/{stationId}", method = RequestMethod.PUT, consumes = {"application/json"})
	public String updateStationDetails(@RequestBody List<StationVo> stationVo, @PathVariable String stationId) {
		System.out.println("in update API &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		return stationService.updateStationDetails(stationVo, stationId);
		}
	
	@RequestMapping(path = "/get/station_by_ID/{qurey}", /*value = "get/station_by_ID/{query}",*/ method = RequestMethod.GET, produces = {"application/json"})
	public List<Station> getStationByStationIdOrName(@PathVariable String stationId, String name) {
		return stationService.getStationDetailsByStationIdorName(stationId, name);
		}
	@RequestMapping(path = "/get/hdEnabled/stations", value = "/get/hdEnabled/stations", method = RequestMethod.GET)
	public List<Station> getHDEnabledStations() {
		return stationService.getStationDetailsforhdEnabled();
	}

}
