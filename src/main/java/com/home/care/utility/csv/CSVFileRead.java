/**
 * Project				:	prjHomeCareServ
  * 
 * Author				:	Bhabesh
 * E-mail               :   bhabesh.m@gmail.com
 *
 * FrameWork			:	Spring boot 2.6 
 * 
 * File Name			:	CSVFileRead.java
 * Package Name			:	com.home.care.utility.csv
 * Date of creation		:	Feb. 8, 2022  12:16:10 a.m.
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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.home.care.bo.RCFECsv;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author bhabesh
 *
 */
public class CSVFileRead {
	private static final Logger log = LoggerFactory.getLogger(CSVFileRead.class);
	
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
	public int totalCsvData(List<RCFECsv> lstCsvData) {
		int total = 0;
		total = ( null != lstCsvData) ? lstCsvData.size(): total;
		return total;
	}
	
	
}
