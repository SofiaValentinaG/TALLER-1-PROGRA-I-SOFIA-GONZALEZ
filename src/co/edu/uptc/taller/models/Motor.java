package co.edu.uptc.taller.models;

import java.time.LocalDate;

public class Motor {
	// clase de composicion el motor pertenece al carro y no puede existir sin el carro
	
	private String serialNumber;
	private String engineId;
	private double power;
	private double torque;
	private LocalDate fabricationYear;
	// 1 constructror vacio y el constructor con todos los atributos
	
	public Motor() {
		super();
	}

	public Motor(String serialNumber, String engineId, double power, double torque, LocalDate fabricationYear) {
		super();
		this.serialNumber = serialNumber;
		this.engineId = engineId;
		this.power = power;
		this.torque = torque;
		this.fabricationYear = fabricationYear;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getEngineId() {
		return engineId;
	}

	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getTorque() {
		return torque;
	}

	public void setTorque(double torque) {
		this.torque = torque;
	}

	public LocalDate getFabricationYear() {
		return fabricationYear;
	}

	public void setFabricationYear(LocalDate fabricationYear) {
		this.fabricationYear = fabricationYear;
	}
	
	
	

}