package com.coforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.LibraryCard;

public interface LibraryCardRepository extends JpaRepository<LibraryCard, Integer>{

}