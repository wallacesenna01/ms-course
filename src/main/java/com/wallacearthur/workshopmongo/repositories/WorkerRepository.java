package com.wallacearthur.workshopmongo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallacearthur.workshopmongo.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long>{

}
