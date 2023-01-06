package com.Auth.model;

public class UpdateProfileModel {
	private int Id;
	private String email;
	private String mobile;
	private String address;
	private String name;
	private int age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UpdateProfileModel [Id=" + Id + ", email=" + email + ", mobile=" + mobile + ", address=" + address
				+ ", name=" + name + ", age=" + age + "]";
	}
	
	
}
