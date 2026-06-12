package com.codinghub.DriverInterFaceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.DriverEntity.Driver;
import com.codinghub.DriverInterFace.DriverServiceInterFace;
import com.codinghub.DriverRepo.DriverRepo;

@Service
public class DriverServiceInterFaceImpl implements DriverServiceInterFace
{

	@Autowired
	private DriverRepo repo;
	@Override
	public List<Driver> findAll() 
	{
	
		return repo.findAll();
	}
	@Override
	public Driver save(Driver driver)
	{
		
		return repo.save(driver);
	}
	@Override
	public Driver update(long id, Driver driverDetails) 
	{
	    Optional<Driver> optionalDriver = repo.findById(id);

	    if (optionalDriver.isPresent()) {
	        Driver existingDriver = optionalDriver.get();

	        // Update only if values are provided (or you can blindly replace all)
	        existingDriver.setName(driverDetails.getName());
	        existingDriver.setMobile(driverDetails.getMobile());
	        existingDriver.setAccount(driverDetails.getAccount());
	        existingDriver.setAadhar(driverDetails.getAadhar());
	        existingDriver.setVehiclenumber(driverDetails.getVehiclenumber());
	        existingDriver.setLocation(driverDetails.getLocation());

	        return repo.save(existingDriver);
	    } 
	    else
	    {
	        // You can throw custom exception or return null
	        throw new RuntimeException("Driver not found with id: " + id);
	    }
	}
	@Override
	public void deleteById(long id) 
	{
		repo.deleteById(id);
		
	}


}
