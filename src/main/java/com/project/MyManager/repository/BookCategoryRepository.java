package com.project.MyManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MyManager.model.BookCatgory;

public interface BookCategoryRepository extends JpaRepository<BookCatgory, Long> {

}
