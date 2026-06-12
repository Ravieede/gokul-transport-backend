package com.codinghub.VehiclesServiceInterface;

import java.util.List;

import com.codinghub.Vehicles.VehicleEntity;

public interface VehiclesServiceInterface {
    List<VehicleEntity> findAll();
    VehicleEntity save(VehicleEntity vehicle);
    VehicleEntity update(long id, VehicleEntity vehicleDetails);
    void deleteById(long id);
}
