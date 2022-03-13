/**
 * Project				:	prjHomeCareServ
  * 
 * Author				:	Bhabesh
 * E-mail               :   bhabesh.m@gmail.com
 *
 * FrameWork			:	Spring boot 2.6 
 * 
 * File Name			:	HomeCareService.java
 * Package Name			:	com.home.care.service
 * Date of creation		:	Feb. 16, 2022  6:44:49 p.m.
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
package com.home.care.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.home.care.bo.RCFECsv;
import com.home.care.bo.RCFEData;
import com.home.care.db.HomeCareDbRepository;
import com.home.care.utility.csv.CsvToDataUtil;

/**
 * @author bhabesh
 *
 */
@Service
//@ComponentScan({"com.home.care.db"})
public class HomeCareService {
	@Autowired
	HomeCareDbRepository careDbRepository;
	
	public void writeAllCsvToRCFE(List<RCFECsv> csvData) {
		CsvToDataUtil csvToDataUtil	=	new CsvToDataUtil();
		List<RCFEData> rcfeDatas = csvToDataUtil.utilGetRcfeCsvToDataList(csvData);
		
		writeAllToRCFETable(rcfeDatas);
		
	}
	
	/**
	 * 
	 * method name  : writeAllToRCFETable
	 * @param data
	 * HomeCareService
	 * return type  : void
	 * 
	 * purpose		: Call JPA to write csv data to Database
	 *
	 * Date    		:	Feb. 23, 2022 6:58:11 p.m.
	 */
	private void writeAllToRCFETable(List<RCFEData> data) {
		List result = careDbRepository.saveAll(data);
	}
}
