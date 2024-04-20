package br.com.kontopp.records_system.Model;

public class Address {

	String state;
	
	String city;
	
	String publicPlace;
	
	int number;
	
	String cep;

	public Address(String state, String city, String publicPlace, int number, String cep) {
		super();
		this.state = state;
		this.city = city;
		this.publicPlace = publicPlace;
		this.number = number;
		this.cep = cep;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
