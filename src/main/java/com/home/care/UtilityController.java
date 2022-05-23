/**
 * 
 */
package com.home.care;

import java.awt.PageAttributes.MediaType;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.care.bo.CSVResult;
import com.home.care.bo.RCFECsv;
import com.home.care.service.HomeCareService;
import com.home.care.utility.csv.CSVFileRead;

/**
 * @author bhabesh
 *
 */
@RestController
@RequestMapping(path = "/homecare/util")
public class UtilityController {
	@Autowired
	HomeCareService	careService;
	
	@GetMapping
	public String getWelcome() {
		return "Welcome to HomeCare REST Service";
	}
	
	@GetMapping("welcome")
	public String getWelcome2() {
		return "{'message': 'welcome'}";
		
	}
	
	@GetMapping("count-csv-rcfe")
	public int getTotalCSVRecords() {
		int total = careService.totalCsvDataCount("RCFE-Data-CA-Aug-2018.csv");
		return total;
	}
	
	@GetMapping("get-rcfe-filename")
	public List<String> getRcfeFileNames() {
		CSVFileRead csvFileRead = new CSVFileRead();
		return csvFileRead.getRCFEFileNames();
	}
	/**
	 * 
	 * @param fileName
	 * @param csvResult
	 * @return
	 * TODO one parameter might need in future : @RequestBody CSVResult csvResult 
	 */
	@CrossOrigin(origins = "http://app.homecare")
	@PostMapping(path="reset-rcfe/{fileName}", produces = "application/json")
	public HashMap<String, String> csvToDatabase(@PathVariable(value = "fileName") String fileName) {
		HashMap<String, String> result = new HashMap<>();
		CSVFileRead csvFileRead	= new CSVFileRead();
		List<RCFECsv> csvList = careService.readCSVFile(fileName);
		int recordSize = careService.writeAllCsvToRCFE(csvList);
		result.put("records", String.valueOf(recordSize));
		return result;
	}
	
	

}
