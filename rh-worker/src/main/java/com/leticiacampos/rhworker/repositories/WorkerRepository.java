package com.leticiacampos.rhworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leticiacampos.rhworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}