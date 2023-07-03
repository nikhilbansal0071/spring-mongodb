package com.springrest.springrest.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.main.model.Viewersmdb;
import com.springrest.springrest.main.repository.viewersmdbrepo;

@RestController
@RequestMapping("/viewer")
public class viewersmdbcontroller {
	
	@Autowired
	private viewersmdbrepo viewersmdbRepo;
	
	@PostMapping("/addviewer")
	public ResponseEntity<?> addViewer(@RequestBody Viewersmdb viewersmdb)
	{
	Viewersmdb save = 	this.viewersmdbRepo.save(viewersmdb);
	return ResponseEntity.ok(save);
	}
	
	
	
	@GetMapping("/getallviewers")
	public ResponseEntity<?> getViewer()
	{
	return ResponseEntity.ok(this.viewersmdbRepo.findAll());
	}
	
	
	}


