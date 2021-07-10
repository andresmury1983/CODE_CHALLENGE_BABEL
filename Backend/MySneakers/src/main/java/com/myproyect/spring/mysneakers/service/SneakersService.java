package com.myproyect.spring.mysneakers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.spring.mysneakers.domain.SneakersRequest;
import com.myproyect.spring.mysneakers.domain.SneakersResponse;
import com.myproyect.spring.mysneakers.respository.SneakersRepository;

@Service
public class SneakersService {
	
	@Autowired
	private SneakersRepository repository;

	public SneakersResponse listSneakers() {
	
		return repository.listSneakers();
		
	}
	
   public SneakersResponse sneakerInfo(String id) {
		
		return repository.sneakerInfo(id);
		
	}
	
   public SneakersResponse addCar(SneakersRequest request) {
		
		return repository.addCar(request);
		
	}
}
