package com.example.jenkindevops.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jenkindevops.entity.Resturant;
import com.example.jenkindevops.repository.ResturantRepository;
import com.example.jenkindevops.service.ResturantService;

@Service
public class ResturantServiceImpl implements ResturantService{

	@Autowired
	private ResturantRepository resturntRepo;
	
	@Override
	public List<Resturant> findByRestaurantName(String name) {
		
		return resturntRepo.findAll();
	}

	@Override
	public List<Resturant> findAll() {
		return resturntRepo.findAll();
	}

}
