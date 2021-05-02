package com.apipothi.propertiesreader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apipothi.propertiesreader.service.Bookservice;

@RestController
public class Bookcontroller {

	@Autowired
	Bookservice bookservice;
	
	@GetMapping("/bookinfo")
	public void getbookInfo() {

		System.out.println("START***-Bookcontroller-getbookInfo()-***");

		bookservice.getDefaultDataFromProperties();
		
		System.out.println("END***-Bookcontroller-getbookInfo()-***");
	}

}

