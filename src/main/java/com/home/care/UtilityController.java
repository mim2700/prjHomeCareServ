/**
 * 
 */
package com.home.care;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping(path = "/homecare")
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
	
	
	@PostMapping("reset-rcfe")
	CSVResult csvToDatabase(@RequestBody CSVResult csvResult) {
		CSVFileRead csvFileRead	= new CSVFileRead();
		List<RCFECsv> csvList = csvFileRead.readCSVFile("RCFE-Data-CA-Aug-2018.csv");
		careService.writeAllCsvToRCFE(csvList);
		
		
		return null;
	}

}
