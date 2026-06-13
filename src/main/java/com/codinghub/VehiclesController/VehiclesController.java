package com.codinghub.VehiclesController;

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

import com.codinghub.Vehicles.VehicleEntity;
import com.codinghub.VehiclesServiceInterface.VehiclesServiceInterface;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = {"http://localhost:3000","https://gokul-transport-admin.vercel.app"})
public class VehiclesController {

    @Autowired
    private VehiclesServiceInterface service;

    // Get all vehicles
    @GetMapping("/getAllVehicles")
    public List<VehicleEntity> getAllVehicles() {
        return service.findAll();
    }

    // Add new vehicle
    @PostMapping("/add")
    public VehicleEntity addVehicle(@RequestBody VehicleEntity vehicle) {
        return service.save(vehicle);
    }

    // Update existing vehicle
    @PutMapping("/update/{id}")
    public VehicleEntity updateVehicle(@PathVariable long id, @RequestBody VehicleEntity vehicleDetails) {
        return service.update(id, vehicleDetails);
    }

    // Delete vehicle by ID
    @DeleteMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable long id) {
        service.deleteById(id);
        return "Vehicle deleted with id: " + id;
    }
}
