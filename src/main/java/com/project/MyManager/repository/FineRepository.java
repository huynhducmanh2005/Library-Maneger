package com.project.MyManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MyManager.model.Fine;

public interface FineRepository extends JpaRepository<Fine, Long> {

}
