package co.edu.uptc.taller.models;
import java.time.format.*;

import co.edu.uptc.taller.enums.Color;
import co.edu.uptc.taller.enums.FuelType;
import co.edu.uptc.taller.enums.TypeVehicle;

import java.time.LocalDate;


public class Car extends Vehicle{
	//entidad principal
	private String idCar;
	private String brand;
	private String model;
	private LocalDate date;
	private float price;
	private Color color;//enum color
	private Company company;
	private Owner owner;
	private Motor motor;
	//constructor de carro
	public Car(String idVehicle, TypeVehicle typeVehicle, float weight, float maximumSpeed, FuelType fuelType,
			String idCar, String brand, String model, LocalDate date, float price, Color color, Company company, Owner owner, Motor motor) {
		super(idVehicle, typeVehicle, weight, maximumSpeed, fuelType);
		this.idCar = idCar;
		this.brand = brand;
		this.model = model;
		this.date = date;
		this.price = price;
		this.color = color;
		this.company= company;
		this.owner= owner;
		this.motor=motor;
	}
	// metodos getter y setter

	

	@Override
	public String toString() {
		return "Car [idCar=" + idCar + ", brand=" + brand + ", model=" + model + ", date=" + date + ", price=" + price
				+ ", color=" + color + ", company=" + company + ", owner=" + owner + ", motor=" + motor + "]";
	}



	public String getIdCar() {
		return idCar;
	}



	public void setIdCar(String idCar) {
		this.idCar = idCar;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	public Company getCompany() {
		return company;
	}



	public void setCompany(Company company) {
		this.company = company;
	}



	public Owner getOwner() {
		return owner;
	}



	public void setOwner(Owner owner) {
		this.owner = owner;
	}



	public Motor getMotor() {
		return motor;
	}



	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	
	


}