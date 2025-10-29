package com.myspringboot;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {

	private final SoftwareEngineerRepository softwareEngineerRepository;
	// This establishes access to the database
	public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
		this.softwareEngineerRepository = softwareEngineerRepository;
	}
	
	public List<SoftwareEngineer> getAllSoftwareEngineers() {
		return softwareEngineerRepository.findAll();
	}
	
	public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
		softwareEngineerRepository.save(softwareEngineer);
	}

	public SoftwareEngineer getSoftwareEngineerById(Integer id) {
		
		return softwareEngineerRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException(id + " not found"));
	}
	
}
