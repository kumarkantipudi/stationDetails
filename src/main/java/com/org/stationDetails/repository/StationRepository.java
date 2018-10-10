/**
 * 
 */
package com.org.stationDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.org.stationDetails.domain.Station;
import com.org.stationDetails.vo.StationVo;

/**
 * @author vijayendrakantipudi
 *
 */
public interface StationRepository extends JpaRepository<Station, Long>{
	
	Station findByStationId(String stationId);
	
//	@Query("SELECT * FROM Station WHERE stationId = stationId or name = name")
//    public List<StationVo> find(@Param("stationId") String stationId, @Param("name") String name);
	List<Station> findByStationIdOrName(@Param("stationId") String stationId, @Param("name") String name);
	//List<Station> findByStationIdorName(String stationId, String name);
	@Query
	public Iterable<Station> findByhdEnabledTrue();
}
