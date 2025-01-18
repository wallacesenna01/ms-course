package com.wallacearthur.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallacearthur.workshopmongo.entities.Worker;
import com.wallacearthur.workshopmongo.repositories.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping
	public ResponseEntity<List<Worker>> findalL(){
		
		List<Worker> list = workerRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	
}
