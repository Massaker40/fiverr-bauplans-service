package de.bauplans.bauplansservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2018. scicom.com.my - All Rights Reserved
 * Created by kalana.w on 5/14/2020.
 */
@RestController
@RequestMapping("")
@CrossOrigin
public class TestController
{
	@GetMapping
	public ResponseEntity<?> index()
	{
		Map<String, String> res = new HashMap<>();
		res.put( "status", "Spring boot is online" );
		return ResponseEntity.ok(res);
	}
}
