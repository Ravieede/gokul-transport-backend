package com.codinghub.DriverInterFace;

import java.util.List;

import com.codinghub.DriverEntity.Driver;

public interface DriverServiceInterFace {

	List<Driver> findAll();

	Driver save(Driver driver);

	Driver update(long id, Driver driverdetails);

	void deleteById(long id);

}
