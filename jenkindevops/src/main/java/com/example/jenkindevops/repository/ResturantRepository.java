package com.example.jenkindevops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jenkindevops.entity.Resturant;

@Repository
public interface ResturantRepository extends JpaRepository<Resturant, Integer>{

}
