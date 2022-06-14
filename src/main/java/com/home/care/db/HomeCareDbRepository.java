/**
 * Project				:	prjHomeCareServ
  * 
 * Author				:	Bhabesh
 * E-mail               :   bhabesh.m@gmail.com
 *
 * FrameWork			:	Spring boot 2.6 
 * 
 * File Name			:	HomeCareDbRepository.java
 * Package Name			:	com.home.care.db
 * Date of creation		:	Feb. 15, 2022  2:07:09 a.m.
 * Date of modification :	
 * 
 * Summary				:	
 *
 *
 * Copyright 2022 the original author or authors and Organization.
 *
 * Licensed under the MIT
 * you may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * 
 */
package com.home.care.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.care.bo.CityZipData;
import com.home.care.bo.RCFEData;
import com.home.care.bo.RcfeFacility;

/**
 * @author bhabesh
 *
 */
@Repository
public interface HomeCareDbRepository extends JpaRepository<RCFEData, RcfeFacility>{
	@Transactional
	@Modifying
    @Query(
            value = "truncate table rcfe",
            nativeQuery = true
    )
	void truncateRCFETable();
	
	@Query(
			value = "select distinct CountyName  from rcfe order by CountyName ASC",
			nativeQuery = true
			)
	List<String> getCountyNames();
	

	//@Query(value = "select FacilityNumber, FacilityCity, FacilityZip from rcfe r  where (r.FacilityCity LIKE :strParam% or r.FacilityZip LIKE :strParam%)",
	@Query(value = "select distinct new CityZipData(count(r.facilityNumber), r.facilityCity, r.facilityZip) from RCFEData r  where (r.facilityCity LIKE :strParam% or r.facilityZip LIKE :strParam%) Group by FacilityZip,  FacilityCity",
			nativeQuery = false
		)
	List<CityZipData> searchByCityZipLike(@Param("strParam") String strParam);
	
	@Query(value="select * from rcfe r where (r.facilityCity LIKE :strParamCity% or r.facilityZip LIKE :strParamZip%)", 
			nativeQuery = true)
	List<RCFEData> getAllByCityZipLike(@Param("strParamCity") String strParamCity, @Param("strParamZip") String strParamZip);
	
}
