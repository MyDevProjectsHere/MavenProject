package com.Auth.model;

public class GetAllUsers {
	
	private int Id;
	private String name;
	private String email;
	private String mobile;
	private String address;
	private int age;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "GetAllUsers [Id=" + Id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + ", age=" + age + "]";
	}
	
	
}
