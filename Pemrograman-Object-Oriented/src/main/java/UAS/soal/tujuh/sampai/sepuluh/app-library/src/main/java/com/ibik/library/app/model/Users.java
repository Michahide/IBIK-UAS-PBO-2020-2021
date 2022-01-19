package com.ibik.library.app.model;

public class Users {
	private Integer ID;
	private Integer NIK; //Ubah ke Integer sesuai class diagram
	private String Fullname;
	private String PlaceBirth;
	private String Birthdate;
	private String Gender;
	private String Address;
	private String Email;
	private String Password;
	
	public Users() {}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer id) {
		ID = id;
	}
	public Integer getNIK() { //Ubah method ke Integer sesuai class diagram
		return NIK;
	}
	public void setNIK(Integer nik) { //Ubah parameter ke Integer sesuai class diagram
		NIK = nik;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getPlaceBirth() {
		return PlaceBirth;
	}
	public void setPlaceBirth(String placeBirth) {
		PlaceBirth = placeBirth;
	}
	public String getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}	
}
