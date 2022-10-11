package com.home.care;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.care.bo.CityZipData;
import com.home.care.bo.RCFEData;
import com.home.care.service.HomeCareService;

@RestController
@RequestMapping(path = "/homecare/service")
@CrossOrigin(origins = "http://app.homecare")
public class ServiceController {
	@Autowired
	HomeCareService careService;
	
	@GetMapping(path = "countynames", produces = "application/json")
	public List<String> getCountyNames() {
		return careService.getCountyNames();
	}
	
	@GetMapping(path = "city-zip/{paramValue}", produces = "application/json") 
	public List<CityZipData>  getCityZip(@PathVariable (value = "paramValue") String paramValue) {
		return careService.searchByCityZipLike(paramValue);
	}
	
	//@GetMapping(path = "search/city/{paramCity}/zip/{paramZip}", produces = "application/json")
	/*
	public List<RCFEData> getAllByCityZipLike(
												@PathVariable (value = "paramCity") String paramCity,
												@PathVariable (value = "paramZip") String paramZip
												) {
		
		return careService.getAllByCityZipLike(paramCity, paramZip);
	}
	*/
	
	@GetMapping(path = "search/city/{paramCity}/zip/{paramZip}", produces = "application/json")
	public List<RCFEData> getRcfeByCityZip(	
											@PathVariable (value = "paramCity") String paramCity,
											@PathVariable (value = "paramZip") String paramZip
										) {
		
		return careService.getRcfeByCityZip(paramCity, paramZip);
	}

}
