package com.codinghub.VehiclesRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codinghub.Vehicles.VehicleEntity;

public interface VehiclesRepo extends JpaRepository<VehicleEntity,Long>
{

}
