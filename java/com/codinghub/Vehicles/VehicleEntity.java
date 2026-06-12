package com.codinghub.Vehicles;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicles")
public class VehicleEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private String VehicleName;
	
	@Column(nullable=false)
	private int VehicleModel;
	
	@Column(nullable=false)
	private String VehicleNumber;
	
	@Column(nullable=false)
	private String VehicleRc;
	
    @Column(nullable = false)
	private LocalDate rcExpiry;

    @Column(nullable = false)
	private String insuranceNumber;

	@Column(nullable = false)
	
	private LocalDate insuranceExpiry;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVehicleName() {
		return VehicleName;
	}

	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}

	public int getVehicleModel() {
		return VehicleModel;
	}

	public void setVehicleModel(int vehicleModel) {
		VehicleModel = vehicleModel;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}

	public String getVehicleRc() {
		return VehicleRc;
	}

	public void setVehicleRc(String vehicleRc) {
		VehicleRc = vehicleRc;
	}

	public LocalDate getRcExpiry() {
		return rcExpiry;
	}

	public void setRcExpiry(LocalDate rcExpiry) {
		this.rcExpiry = rcExpiry;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public LocalDate getInsuranceExpiry() {
		return insuranceExpiry;
	}

	public void setInsuranceExpiry(LocalDate insuranceExpiry) {
		this.insuranceExpiry = insuranceExpiry;
	}
	
}

	