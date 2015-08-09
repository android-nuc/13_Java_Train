package com.test;

public class Son extends Father implements DangYuan{
	private String name,age;

	public Son(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(String age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public void Da() {
		// TODO Auto-generated method stub
		super.Da();
		System.out.println("疼死我了");
	}

	@Override
	public void readDangZhang() {
		// TODO Auto-generated method stub
		
		System.out.println("习大大光临庆丰包子铺，全国上下认真贯彻执行");
	}

	
}
