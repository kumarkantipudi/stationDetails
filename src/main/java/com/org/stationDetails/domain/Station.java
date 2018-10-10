/**
 * 
 */
package com.org.stationDetails.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "station")
public class Station extends Auditable implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3760605466594593292L;

	@Id
	@Column(name = "stationId", nullable = false)
	private String stationId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "hdEnabled", nullable = false)
	private boolean hdEnabled;
	
	@Column(name = "callSign", nullable = false)
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
		return "Station [stationId=" + stationId + ", name=" + name + ", hdEnabled=" + hdEnabled + ", callSign="
				+ callSign + "]";
	}

}
