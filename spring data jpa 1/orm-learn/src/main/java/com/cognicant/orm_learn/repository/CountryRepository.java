package com.cognicant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognicant.orm_learn.mode1.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}