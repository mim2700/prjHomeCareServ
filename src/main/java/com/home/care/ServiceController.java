package com.home.care;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.care.service.HomeCareService;

@RestController
@RequestMapping(path = "/homecare/service")
public class ServiceController {
	@Autowired
	HomeCareService careService;
	
	@GetMapping(path = "countynames", produces = "application/json")
	public List<String> getCountyNames() {
		return careService.getCountyNames();
	}
	

}
