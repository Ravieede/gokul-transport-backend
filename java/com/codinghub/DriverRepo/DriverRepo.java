package com.codinghub.DriverRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codinghub.DriverEntity.Driver;

public interface DriverRepo extends JpaRepository<Driver,Long>
{

}
