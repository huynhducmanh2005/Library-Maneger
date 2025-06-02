package com.project.MyManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MyManager.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
