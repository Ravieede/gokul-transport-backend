package com.codinghub.VehiclesServiceInterfaceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Vehicles.VehicleEntity;
import com.codinghub.VehiclesRepo.VehiclesRepo;
import com.codinghub.VehiclesServiceInterface.VehiclesServiceInterface;

@Service
public class VehiclesServiceImpl implements VehiclesServiceInterface {

    @Autowired
    private VehiclesRepo repository;

    @Override
    public List<VehicleEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public VehicleEntity save(VehicleEntity vehicle) {
        return repository.save(vehicle);
    }

    @Override
    public VehicleEntity update(long id, VehicleEntity vehicleDetails) {
        Optional<VehicleEntity> existingVehicle = repository.findById(id);
        if (existingVehicle.isPresent()) {
            VehicleEntity vehicle = existingVehicle.get();
            vehicle.setVehicleName(vehicleDetails.getVehicleName());
            vehicle.setVehicleModel(vehicleDetails.getVehicleModel());
            vehicle.setVehicleNumber(vehicleDetails.getVehicleNumber());
            vehicle.setVehicleRc(vehicleDetails.getVehicleRc());
            vehicle.setRcExpiry(vehicleDetails.getRcExpiry());
            vehicle.setInsuranceNumber(vehicleDetails.getInsuranceNumber());
            vehicle.setInsuranceExpiry(vehicleDetails.getInsuranceExpiry());
            return repository.save(vehicle);
        }
        return null;
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
