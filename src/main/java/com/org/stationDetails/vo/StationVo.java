/**
 * 
 */
package com.org.stationDetails.vo;

/**
 * @author vijayendrakantipudi
 *
 */
public class StationVo {

	private String stationId;
	private String name;
	private boolean hdEnabled;
	private String callSign;
	/**
	 * @return the stationId
	 */
	public String getStationId() {
		return stationId;
	}
	/**
	 * @param stationId the stationId to set
	 */
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hdEnabled
	 */
	public boolean isHdEnabled() {
		return hdEnabled;
	}
	/**
	 * @param hdEnabled the hdEnabled to set
	 */
	public void setHdEnabled(boolean hdEnabled) {
		this.hdEnabled = hdEnabled;
	}
	/**
	 * @return the callSign
	 */
	public String getCallSign() {
		return callSign;
	}
	/**
	 * @param callSign the callSign to set
	 */
	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StationVo [stationId=" + stationId + ", name=" + name + ", hdEnabled=" + hdEnabled + ", callSign="
				+ callSign + "]";
	}
}
