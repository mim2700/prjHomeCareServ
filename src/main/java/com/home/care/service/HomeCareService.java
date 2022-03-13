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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
