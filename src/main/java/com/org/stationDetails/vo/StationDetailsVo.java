/**
 * 
 */
package com.org.stationDetails.vo;

import java.util.List;

/**
 * @author vijayendrakantipudi
 *
 */
public class StationDetailsVo {
	
	private List<StationVo> stationVo;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StationDetailsVo [stationVo=" + stationVo + "]";
	}

	/**
	 * @return the stationVo
	 */
	public List<StationVo> getStationVo() {
		return stationVo;
	}

	/**
	 * @param stationVo the stationVo to set
	 */
	public void setStationVo(List<StationVo> stationVo) {
		this.stationVo = stationVo;
	}

}
