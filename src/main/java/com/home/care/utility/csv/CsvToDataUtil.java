/**
 * Project				:	prjHomeCareServ
  * 
 * Author				:	Bhabesh
 * E-mail               :   bhabesh.m@gmail.com
 *
 * FrameWork			:	Spring boot 2.6 
 * 
 * File Name			:	CsvToDataUtil.java
 * Package Name			:	com.home.care.utility.csv
 * Date of creation		:	Feb. 20, 2022  1:46:22 p.m.
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
package com.home.care.utility.csv;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.home.care.bo.RCFECsv;
import com.home.care.bo.RCFEData;
import com.home.care.bo.RcfeFacility;

/**
 * @author bhabesh
 *
 */
public class CsvToDataUtil {
	private static final Logger log = LoggerFactory.getLogger(CsvToDataUtil.class);
/**
 * 
 * method name  : utilCsvToData
 * @param csv
 * @return
 * CsvToDataUtil
 * return type  : RCFEData
 * 
 * purpose		: Transfer csv data to RCFE Db data
 *
 * Date    		:	Feb. 23, 2022 6:17:12 p.m.
 */
	public RCFEData utilCsvToData(RCFECsv csv ) {
		RCFEData data	= new RCFEData();
		RcfeFacility	rcfeFacility = new RcfeFacility();
		rcfeFacility.setFacilityNumber(Long.parseLong(csv.getFacilityNumber()));
		data.setFacilityNumber(rcfeFacility);
		data.setFacilityName(csv.getFacilityName());
		data.setLicensee(csv.getLicensee());
		data.setFacilityAdministrator(csv.getFacilityAdministrator());
		data.setFacilityTelephoneNumber(csv.getFacilityTelephoneNumber());
		data.setFacilityAddress(csv.getFacilityAddress());
		data.setFacilityCity(csv.getFacilityCity());
		data.setFacilityState(csv.getFacilityState());
		data.setFacilityZip(csv.getFacilityZip());
		data.setCountyName(csv.getCountyName());
		data.setRegionalOffice(csv.getRegionalOffice());
		data.setFacilityCapacity(csv.getFacilityCapacity());
		data.setFacilityStatus(csv.getFacilityStatus());
		data.setLicenseFirstDate(csv.getLicenseFirstDate());
		data.setClosedDate(csv.getClosedDate());
		data.setLastVisitDate(csv.getLastVisitDate());
		data.setInspectionVisits(csv.getInspectionVisits());
		data.setComplaintVisits(csv.getComplaintVisits());
		data.setOtherVisits(csv.getOtherVisits());
		data.setTotalVisits(csv.getTotalVisits());
		data.setCitationNumbers(csv.getCitationNumbers());
		data.setPocDates(csv.getPocDates());
		data.setAllVisitDates(csv.getAllVisitDates());
		data.setInspectionVisitDates(csv.getInspectionVisitDates());
		data.setInspectTypeA(csv.getInspectTypeA());
		data.setInspectTypeB(csv.getInspectTypeB());
		data.setOtherVisitDates(csv.getOtherVisitDates());
		data.setOtherTypeA(csv.getOtherTypeA());
		data.setOtherTypeB(csv.getOtherTypeB());
		data.setComplaintTypeA(csv.getComplaintTypeA());
		data.setComplaintTypeB(csv.getComplaintTypeB());
		data.setTotalAllegations(csv.getTotalAllegations());
		data.setInconclusiveAllegations(csv.getInconclusiveAllegations());
		data.setSubstantiatedAllegations(csv.getSubstantiatedAllegations());
		data.setUnsubstantiatedAllegations(csv.getUnsubstantiatedAllegations());
		data.setUnfoundedAllegations(csv.getUnfoundedAllegations());
/*		
		data.setComplaintInfoDate(csv.getComplaintInfoDate());
		data.setSubA(csv.getSubA());
		data.setIncA(csv.getIncA());
		data.setUnsA(csv.getUnsA());
		data.setUnfA(csv.getUnfA());
		data.setTypeA(csv.getTypeA());
		data.setTypeB(csv.getTypeB());
*/			
		
		return data;
	}
	
	/**
	 * 
	 * method name  : utilGetRcfeCsvToDataList
	 * @param csvList
	 * @return
	 * CsvToDataUtil
	 * return type  : List<RCFEData>
	 * 
	 * purpose		: Convert CSV to RCFE Db format
	 *
	 * Date    		:	Feb. 23, 2022 6:30:18 p.m.
	 */
	public List<RCFEData> utilGetRcfeCsvToDataList(List<RCFECsv> csvList) {
		List<RCFEData> rcfeDatas = new ArrayList<RCFEData>();
		int i = 0;
		for(RCFECsv csv: csvList) {
			//if (i == 5) break; i++;
			if (null != csv.getFacilityNumber() && !csv.getFacilityName().trim().equals("")) {
				if (isNumeric(csv.getFacilityNumber())) {
					
					RCFEData data	= this.utilCsvToData(csv);
					rcfeDatas.add(data);
				}
			}
			else {
				log.info("Facility Number : "+csv.getFacilityNumber());
			}
		}
			
		return rcfeDatas;
	}
	
	/**
	 * 
	 * @param strNum
	 * @return
	 */
	private static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        long l = Long.parseLong(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
}
