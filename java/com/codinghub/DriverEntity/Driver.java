package com.codinghub.DriverEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="driver")
public class Driver 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Driver_Name" ,nullable=false)
	private String name;
	
	@Column(name="Driver_Mobile",nullable=false)
	private String mobile;
	
	@Column(name="Driver_AccountNumber",nullable=false)
	private String account;
	
	@Column(name="Driver_AadharNumber",nullable=false)
	private String aadhar;
	
	@Column(name="Driver_VehicleNumber",nullable=true)
	private String vehiclenumber;
	
	@Column(name="Driver_Location",nullable=true)
	private String location;

	public long getId()
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getMobile() 
	{
		return mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account) 
	{
		this.account = account;
	}

	public String getAadhar() 
	{
		return aadhar;
	}

	public void setAadhar(String aadhar) 
	{
		this.aadhar = aadhar;
	}

	public String getVehiclenumber()
	{
		return vehiclenumber;
	}

	public void setVehiclenumber(String vehiclenumber) 
	{
		this.vehiclenumber = vehiclenumber;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}


	
	

	

}
