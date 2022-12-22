package com.example.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.blueprint.Bank;

public interface Repository extends JpaRepository<Bank,Integer>{
	

}
