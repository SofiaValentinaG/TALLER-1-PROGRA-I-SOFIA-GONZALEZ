package co.edu.uptc.taller.models;
import java.util.List;
import java.util.ArrayList;


public class Company {
	// clase agregacion, un carro pertenece a una empresa pero el carro puede existir sin la empresa
	
	private String idCompany;
	private String name;
	private String address;
	private String telephone;
	private String city;
	private List<Car> cars;
	
	public Company() {
		super();
	}
	//constructor
	public Company(String idCompany, String name, String address, String telephone, String city) {
		super();
		this.idCompany = idCompany;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.city = city;
		this.cars= new ArrayList<>();
	}
	public String getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(String idCompany) {
		this.idCompany = idCompany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	


}
