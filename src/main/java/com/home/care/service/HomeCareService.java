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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.transaction.Transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.care.bo.CityZipData;
import com.home.care.bo.RCFECsv;
import com.home.care.bo.RCFEData;
import com.home.care.db.HomeCareDbRepository;
import com.home.care.utility.csv.CSVFileRead;
import com.home.care.utility.csv.CsvToDataUtil;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author bhabesh
 *
 */
@Service
//@ComponentScan({"com.home.care.db"})
public class HomeCareService {
	private static final Logger log = LoggerFactory.getLogger(CSVFileRead.class);
	
	@Autowired
	HomeCareDbRepository careDbRepository;
	
	/**
	 * 
	 * method name  : readCSVFile
	 * @param fileName
	 * @return
	 * CSVFileRead
	 * return type  : List<RCFE>
	 * 
	 * purpose		: Reading CSV File
	 *
	 * Date    		:	Feb. 8, 2022 12:46:11 a.m.
	 */
	public List<RCFECsv> readCSVFile(String fileName) {
		String classPath 	=  	System.getProperty("user.dir");
		String relativePath =	"/src/main/resources/";
		String filePath		=	classPath+relativePath+fileName;
		
		List<RCFECsv>	lstRCFE	=	null;
		
		try {
			lstRCFE	=	new CsvToBeanBuilder(new FileReader(filePath))
				.withType(RCFECsv.class)
				.build()
				.parse();
		}
		catch(FileNotFoundException fnfEx) {
			log.error("Error in reading file : {}",fnfEx.getMessage());
		}
		
		return lstRCFE;
	}	

	/**
	 * 
	 * @param lstCsvData
	 * @return
	 */
	public int totalCsvDataCount(String fileName) {
		int total = 0;
		List<RCFECsv> lstCsvData = readCSVFile(fileName);
		total = ( null != lstCsvData) ? lstCsvData.size(): total;
		return total;
	}
	
	public int writeAllCsvToRCFE(List<RCFECsv> csvData) {
		CsvToDataUtil csvToDataUtil	=	new CsvToDataUtil();
		List<RCFEData> rcfeDatas = csvToDataUtil.utilGetRcfeCsvToDataList(csvData);
		
		return writeAllToRCFETable(rcfeDatas);
		
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
	 * TODO : Need to use truncate table before save all the data 
	 * https://stackoverflow.com/questions/52989131/is-it-possible-to-use-truncate-in-spring-data-jpa-using-jparepository-or-a-mo
	 */
	@Transactional
	private int writeAllToRCFETable(List<RCFEData> data) {
		
		careDbRepository.truncateRCFETable();
		List<RCFEData> result = careDbRepository.saveAll(data);
		return result.size();
	}
	
	/**
	 * 
	 * @return
	 */
	public List<String> getCountyNames() {
		return careDbRepository.getCountyNames();
	}
	
	/**
	 * 
	 * @param strParam
	 * @return
	 */
	public List<CityZipData> searchByCityZipLike(String strParam) {
		return careDbRepository.searchByCityZipLike(strParam);
	}

	/**
	 * 
	 * @param strParamCity
	 * @param strParamZip
	 * @return
	 */
	public List<RCFEData> getAllByCityZipLike(String strParamCity, String strParamZip) {
		return careDbRepository.getAllByCityZipLike(strParamCity,strParamZip);
	}
	
	/**
	 * 
	 * @param strParamCity
	 * @param strParamZip
	 * @return
	 */
	public List<RCFEData> getRcfeByCityZip(String strParamCity, String strParamZip) {
		return careDbRepository.getRcfeByCityZip(strParamCity, strParamZip);
	}
	
}
