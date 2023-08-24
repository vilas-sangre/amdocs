package com.amdocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
}
