package com.dockk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@GetMapping(value="/getString")
	public String getString() {
		return "Gangadharan";
	}

}
