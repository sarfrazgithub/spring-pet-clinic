package com.spc.services;

import java.util.Set;

import com.spc.model.Pet;

public interface PetService {

	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
