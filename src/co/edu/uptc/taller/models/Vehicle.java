package co.edu.uptc.taller.models;
import co.edu.uptc.taller.enums.FuelType;
import co.edu.uptc.taller.enums.TypeVehicle;
public class Vehicle {
	//clase padre
	
	protected String idVehicle;
	protected TypeVehicle typeVehicle; // enums del tipo de vehiculo
	protected float weight;
	protected float maximumSpeed;
	protected FuelType fuelType; // enum del tipo de gasolina
	
	
	
	public Vehicle() {
		super();
	}
	public Vehicle(String idVehicle, TypeVehicle typeVehicle, float weight, float maximumSpeed, FuelType fuelType) {
		super();
		this.idVehicle = idVehicle;
		this.typeVehicle = typeVehicle;
		this.weight = weight;
		this.maximumSpeed = maximumSpeed;
		this.fuelType = fuelType;
	}
	public String getIdVehicle() {
		return idVehicle;
	}
	public void setIdVehicle(String idVehicle) {
		this.idVehicle = idVehicle;
	}
	public TypeVehicle getTypeVehicle() {
		return typeVehicle;
	}
	public void setTypeVehicle(TypeVehicle typeVehicle) {
		this.typeVehicle = typeVehicle;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getMaximumSpeed() {
		return maximumSpeed;
	}
	public void setMaximumSpeed(float maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Vehicle [idVehicle=" + idVehicle + ", typeVehicle=" + typeVehicle + ", weight=" + weight
				+ ", maximumSpeed=" + maximumSpeed + ", fuelType=" + fuelType + "]";
	}
	
	
	
	

}