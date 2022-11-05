package com.mini.dto;

import java.util.ArrayList;

public class MemberDTO {

	private String id;
	private String name;
	
	private int age;
	private String address;
	private char gender;
	private int cMount;
	
	public MemberDTO() {
	
	}

	public MemberDTO(String id, String name, int age, String address, char gender, int cMount) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.cMount = cMount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public int getcMount() {
		return cMount;
	}

	public void setcMount(int cMount) {
		this.cMount = cMount;
	}
	
	public void getInfo() {
		
		System.out.print("id : " + id + ", name : " + name + ", age : "  + age + 
				          ", address : " + address + ", gender : " + gender);
	}
	
	ArrayList<ProductDTO> sList = new ArrayList<>();
	
	
	public void slist() {
		sList.add(new ProductDTO("스킨", 7000));
		sList.add(new ProductDTO("로션", 5000));
		sList.add(new ProductDTO("에센스", 20000));
		
	}
	
	public void purchase() {
		
		
	}
	
}
