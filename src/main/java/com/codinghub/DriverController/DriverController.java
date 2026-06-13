package com.codinghub.DriverController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.DriverEntity.Driver;
import com.codinghub.DriverInterFace.DriverServiceInterFace;

@RestController()
@RequestMapping("/api/drivers")
@CrossOrigin(origins={"http://localhost:3000","https://gokul-transport-admin.vercel.app",})
public class DriverController 
{
	@Autowired
	private DriverServiceInterFace  service;
	
	@GetMapping("/getAllDrivers")
	public List<Driver> getAllDrivers()
	{
		return service.findAll();
	}
	@PostMapping("/add")
	public Driver addDriver(@RequestBody Driver driver)
	{
		return service.save(driver);
	}
	@PutMapping("/update/{id}")
	public Driver updateDriver(@PathVariable long id,@RequestBody Driver driverdetails)
	{
		return service.update(id,driverdetails);
	}
	@DeleteMapping("/delete/{id}")
	public String  deleteDriver(@PathVariable long id)
	{
		service.deleteById(id);
	    return "Driver deleted with id: " + id;
	}
	
	

}
