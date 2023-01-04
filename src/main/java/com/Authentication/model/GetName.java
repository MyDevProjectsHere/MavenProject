package com.Authentication.model;

public class GetName {
	
	private int Id;
	private String name;
	private String email;
	private int age;
	private String empAddress;
	private String salry;
	private String err;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getSalry() {
		return salry;
	}
	public void setSalry(String salry) {
		this.salry = salry;
	}
	public void setErroMessage(String errMessage) {
		this.err = errMessage;
	}
	public String getErrorMessage() {
		return err;
	}
	@Override
	public String toString() {
		return "GetName [Id=" + Id + ", name=" + name + ", email=" + email + ", age=" + age + ", empAddress="
				+ empAddress + ", salry=" + salry + "]";
	}
	
	
	        
}
