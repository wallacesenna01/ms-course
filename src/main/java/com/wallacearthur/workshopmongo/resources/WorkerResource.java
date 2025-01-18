package com.wallacearthur.workshopmongo.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<List<Worker>> findall(){
		
		List<Worker> list = workerRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
	    Optional<Worker> obj = workerRepository.findById(id);
	    if (obj.isPresent()) {
	        return ResponseEntity.ok(obj.get());
	    } else {
	        return ResponseEntity.notFound().build(); // Retorna 404 se o registro não existir
	    }
	}


	
}
