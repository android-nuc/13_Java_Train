package com.test;

public class Father {
	
	/*public Father(){
		
	}*/
	public Father(String name, String age){
		this.age = age;
		this.name = name;
	}
	private String name;
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void Da(){
		System.out.println("你老子气的不行");
	}
	
	
}
