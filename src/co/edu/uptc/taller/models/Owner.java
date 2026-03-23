package co.edu.uptc.taller.models;

public class Owner {
	//Clase asociacion, un carro tiene un propietario
	
	private String idOwner;
	private String name;
	private String telephone;
	private String adress;
	private String email;
	public Owner(String idOwner, String name, String telephone, String adress, String email) {
		super();
		this.idOwner = idOwner;
		this.name = name;
		this.telephone = telephone;
		this.adress = adress;
		this.email = email;
	}
	public String getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(String idOwner) {
		this.idOwner = idOwner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Owner [idOwner=" + idOwner + ", name=" + name + ", telephone=" + telephone + ", adress=" + adress
				+ ", email=" + email + "]";
	}


}